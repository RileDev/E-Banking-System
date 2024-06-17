import classes.auth.Authenticator;
import classes.dataManagement.CSVManager;
import classes.dataManagement.DataFormatter;
import classes.dataManagement.Validator;
import classes.ui.Menu;
import classes.user.Account;
import classes.user.User;
import exceptions.NoUserFoundException;

import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoUserFoundException {
        Scanner userInput = new Scanner(System.in);
        User user = null;
        Account userAccount = null;
        System.out.println("E-Banking App");

        while(true){
            System.out.println("=============");
            System.out.println("1) Register a new account");
            System.out.println("2) LogIn to an existing account");
            System.out.print("> ");
            Character choice = userInput.nextLine().charAt(0);

            switch (choice){
                case '1':
                    register(userInput);
                    break;
                case '2':
                    try{
                        login(userInput, user, userAccount);
                    }catch (NoUserFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }

    }

    private static void register(Scanner userInput) {
        System.out.println("Enter your first name: ");
        String firstName = userInput.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = userInput.nextLine();
        System.out.println("Enter your gender (write 'm' or 'male' for male, 'f' or 'female' for female): ");
        String gender = userInput.nextLine();
        gender = DataFormatter.formatGender(gender);
        if(gender == null) {
            System.out.println("Invalid input! Invalid gender input");
            return;
        }
        System.out.println("Enter your e-mail address: ");
        String email = userInput.nextLine();
        System.out.println("Enter your pin code: ");
        String pin = userInput.nextLine();

        if(!Validator.validateCredentials(email, pin)){
            System.out.println("Invalid input! Your e-mail or pin code is not valid.");
            return;
        }

        System.out.println("Enter your ID number: ");
        String idNumber = userInput.nextLine();

        if(!Validator.validateIDNumber(idNumber)){
            System.out.println("Invalid input! Your ID must contain numbers and must have 13 digits.");
            return;
        }

        CSVManager.addUserToCSV(firstName, lastName, gender, email, pin, idNumber);
        System.out.println("User " + firstName + " " + lastName + " was added successfully!");

    }

    private static void login(Scanner userInput, User user, Account userAccount) throws NoUserFoundException {
        String userEmail = null;
        String pinCode = null;

        do{
            System.out.println("Insert your e-mail address: ");
            userEmail = userInput.nextLine();
            System.out.println("Insert your pin code");
            pinCode = userInput.nextLine();

            if(!Validator.validateCredentials(userEmail, pinCode)){
                System.out.println("Incorrect input!");
                throw new NoUserFoundException("Can't login into the system.");
            }
        }while(!Validator.validateCredentials(userEmail, pinCode));

        try {
            user = Authenticator.authenticateUser(userEmail, pinCode);
            userAccount = Authenticator.authenticateUserAccount(user);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (NullPointerException n){
            System.out.println("No user has been found!");
        }

        if(user == null) throw new NoUserFoundException("Can't login into the system.");
        Menu.menu(user, userInput, userAccount);
    }
}
package classes.ui;

import classes.user.Account;
import classes.auth.Authenticator;
import classes.user.Transaction;
import classes.user.User;
import classes.dataManagement.CSVManager;
import exceptions.NotEnoughBalanceException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu(User user, Scanner input, Account userAccount) {
        System.out.println(user.toString());
//        Character choice = '0';
        while (true){
            displayMenuMessage();
            try{
                System.out.print("> ");
                char choice = input.nextLine().charAt(0);
                redirectTo(choice, user, input, userAccount);
            }catch(Exception ex){
                System.out.println("Invalid input");
            }
        }

    }

    private static void redirectTo(char choice, User user, Scanner input, Account userAccount) {
        switch (choice){
            case '0':
                exitApplication();
            case '1':
                displayBalance(userAccount);
                break;
            case '2':
                sendMoney(user, input, userAccount);
                break;
            case '3':
                changePin(user, input);
                break;
            case '4':
                displayUserProfile(userAccount);
                break;
            case '5':
                checkTransaction(input, userAccount);
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    private static void checkTransaction(Scanner input, Account userAccount) {
        try {
            Scanner reader = new Scanner(new File("log.txt"));
            String userAccountNumber = userAccount.getAccountNumber();

            System.out.println("Write a date of created transaction (format dd-MM-yyyy): ");
            String dateInput = input.nextLine();

            List<String> transactions = fetchTransactions(reader, userAccountNumber, dateInput);
            if(transactions.isEmpty()){
                System.out.println("No transactions found for the given date!");
            }else{
                String transactionMsg = transactions.size() == 1 ? "1 transaction found" : transactions.size() + " transactions found";
                System.out.println(transactionMsg);
                separator(6);
                for(String transaction : transactions){
                    System.out.println(transaction);
                }

                reader.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static List<String> fetchTransactions(Scanner reader, String userAccountNumber, String dateInput) {
        List<String> result = new ArrayList<>();

        while(reader.hasNextLine()){
            String line = reader.nextLine();
            if(line.contains(userAccountNumber) && line.contains(dateInput) && !dateInput.isEmpty()){
                result.add(line);
            }

        }

        return result;

    }

    private static void displayUserProfile(Account userAccount) {
        separator(6);
        System.out.println(userAccount.toString());
    }

    private static void changePin(User user, Scanner input) {
        System.out.println("Change pin");
        System.out.println("Current pin: ");
        String currentPin = input.next();

        if(!currentPin.trim().equals(user.getPinCode())){
            System.out.println("Invalid pin entered. Returning to main menu...");
            return;
        }

        System.out.println("Write a new pin: ");
        String newPin = input.next();
        System.out.println("Repeat a new pin: ");
        String newPinRepeated = input.next();

        if(!newPin.trim().equals(newPinRepeated)){
            System.out.println("Pins you've provided are not same. Returning to main menu...");
            return;
        }

        user.setPinCode(newPin);
        try {
            CSVManager.changePinInDatabase(user.getIdNumber(), user.getPinCode());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("PIN updated successfully");

    }

    private static void sendMoney(User user, Scanner input, Account userAccount) {
        System.out.println("Enter the recipient's account number: ");
        String recipientNumber = input.next();
        if(userAccount.getAccountNumber().equals(recipientNumber)){
            System.out.println("You cannot transfer money to your account!");
        }else{
            System.out.println("Enter the amount you want to send: ");
            double amount = input.nextDouble();
            System.out.println("Enter the purpose of payment: ");
            input.nextLine();
            String purpose = input.nextLine();
            try {
                User recipient = Authenticator.authenticateUser(recipientNumber);
                Account recipientAccount = Authenticator.authenticateUserAccount(recipient);
                if(userAccount.payment(recipientAccount, amount)){
                    CSVManager.changeAmount(user.getIdNumber(), userAccount.getBalance());
                    CSVManager.changeAmount(recipient.getIdNumber(), recipientAccount.getBalance());
                    System.out.println("Funds were sent successfully");
                    Transaction newTransaction = new Transaction(userAccount.getAccountNumber(), recipientNumber, amount, purpose);
                    newTransaction.logTransaction();
                }

            }catch (NotEnoughBalanceException e){
                System.out.println(e.getMessage());
            }
            catch (FileNotFoundException e) {
                System.out.println("User not found!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static void displayBalance(Account userAccount) {
        separator(6);
        System.out.println("Your balance: ");
        System.out.println(userAccount.getBalance() + " EUR");
    }

    private static void exitApplication() {
        separator(6);
        System.out.println("Exiting the app...");
        System.out.println("Thanks for using our services :)");
        System.exit(0);
    }

    private static void displayMenuMessage() {
        separator(6);
        System.out.println("1) Check your balance");
        System.out.println("2) Transfer funds");
        System.out.println("3) Change your PIN code");
        System.out.println("4) Check your profile");
        System.out.println("5) Check your transactions");
        System.out.println("0) Exit the application");
    }

    private static void separator(int len){
        for (int i = 0; i < len; i++){
            System.out.print("-");
        }
        System.out.println(" ");
    }
}

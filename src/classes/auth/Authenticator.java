package classes.auth;

import classes.user.Account;
import classes.user.IndividualAccount;
import classes.user.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Authenticator{
    public static User authenticateUser(String email, String pinCode) throws FileNotFoundException {
        Scanner input = new Scanner(new File("users.csv"));

        while(input.hasNext()){
            String[] users = input.next().split(",");
            if(users[3].equals(email) && users[4].equals(pinCode)){
                input.close();
                return new User(users[0], users[1], users[2], users[3], users[4], users[5]);
            }
        }
        input.close();
        return null;
    }

    public static User authenticateUser(String accountNumber) throws FileNotFoundException {
        Scanner input = new Scanner(new File("users.csv"));

        while(input.hasNext()){
            String[] users = input.next().split(",");
            if(users[6].equals(accountNumber)){
                input.close();
                return new User(users[0], users[1], users[2], users[3], users[4], users[5]);
            }
        }
        input.close();
        return null;
    }

    public static Account authenticateUserAccount(User user) throws FileNotFoundException{
        Scanner input = new Scanner(new File("users.csv"));

        while(input.hasNext()){
            String[] users = input.next().split(",");
            if(users[5].equals(user.getIdNumber())){
                input.close();
                return new IndividualAccount(user, users[6], Double.parseDouble(users[7]));
            }
        }

        input.close();
        return null;

    }

}

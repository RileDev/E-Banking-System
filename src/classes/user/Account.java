package classes.user;

import exceptions.NoUserFoundException;
import exceptions.NotEnoughBalanceException;
import interfaces.Payment;

public abstract class Account implements Payment {
    private User user;
    private String accountNumber;
    private double balance;

    public Account(User user, String accountNumber, double balance) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0)
            this.balance = balance;
        else
            System.out.println("Invalid amount!");
    }

    public boolean payment(Account account2, double amount) throws NotEnoughBalanceException {
        if(amount <= 0) {
            throw new NotEnoughBalanceException("Amount can't be a negative number or a zero");
        }
        if(this.balance >= amount){
            account2.setBalance(account2.getBalance() + amount);
            this.balance -= amount;
            return true;
        }
        else{
//            System.out.println("You don't have enough balance to transfer to another account");
            throw new NotEnoughBalanceException("You don't have enough balance to transfer to another account");
        }
    }

    @Override
    public String toString() {
        return "Full name: " + user.getFirstName() + " " + user.getLastName() +
                "\nGender: " + user.getGender() +
                "\nE-mail: " + user.getEmail() +
                "\nPin: " + user.getPinCode() +
                "\nID Number: " + user.getIdNumber() +
                "\nAccount number: " + this.accountNumber +
                "\nBalance: " + this.balance + " EUR";
    }
}

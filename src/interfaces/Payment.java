package interfaces;

import classes.user.Account;
import exceptions.NotEnoughBalanceException;

public interface Payment {
    public boolean payment(Account account2, double amount) throws NotEnoughBalanceException;
}

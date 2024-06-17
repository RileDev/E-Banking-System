import classes.user.Account;
import classes.user.IndividualAccount;
import classes.user.User;
import exceptions.NotEnoughBalanceException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void paymentPositiveTest(){
        //Arrange
        double amount = 2000;
        double expectedAmountUser1 = 1000;
        double expectedAmountUser2 = 5000;

        User u1 = new User("Pera", "Peric", "male", "mail@mail.com", "2333", "121331");
        Account a1 = new IndividualAccount(u1, "1234", 3000);

        User u2 = new User("Petar", "Petrovic", "male", "mail@mail.com", "2333", "121331");
        Account a2 = new IndividualAccount(u2, "1234", 3000);

        try {
            a1.payment(a2, amount);
        } catch (NotEnoughBalanceException e) {
            throw new RuntimeException(e);
        }

        assertEquals(a1.getBalance(), expectedAmountUser1, 0.0);
        assertEquals(a2.getBalance(), expectedAmountUser2, 0.0);
    }

    @Test (expected = NotEnoughBalanceException.class)
    public void paymentIfUserDoesntHaveEnoughBalance() throws NotEnoughBalanceException {
        //Arrange
        double amount = 4000;

        User u1 = new User("Pera", "Peric", "male", "mail@mail.com", "2333", "121331");
        Account a1 = new IndividualAccount(u1, "1234", 3000);

        User u2 = new User("Petar", "Petrovic", "male", "mail@mail.com", "2333", "121331");
        Account a2 = new IndividualAccount(u2, "1234", 3000);

        a1.payment(a2, amount);
    }

    @Test(expected = NotEnoughBalanceException.class)
    public void paymentZeroOrNegative() throws NotEnoughBalanceException{
        //Arrange
        double amount = -1000;

        User u1 = new User("Pera", "Peric", "male", "mail@mail.com", "2333", "121331");
        Account a1 = new IndividualAccount(u1, "1234", 3000);

        User u2 = new User("Petar", "Petrovic", "male", "mail@mail.com", "2333", "121331");
        Account a2 = new IndividualAccount(u2, "1234", 3000);

        a1.payment(a2, amount);

    }
}
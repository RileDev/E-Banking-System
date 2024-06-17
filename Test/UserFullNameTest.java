import classes.user.User;
import exceptions.BadNameException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFullNameTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void firstAndLastName(){
        String fName = "Milica";
        String lName = "Petrovic";

        User u = new User();

        try {
            u.setFirstName(fName);
            u.setLastName(lName);
        } catch (BadNameException e) {
            throw new RuntimeException(e);
        }

        assertEquals(u.getFirstName(), fName);
        assertEquals(u.getLastName(), lName);
    }
    @Test(expected = BadNameException.class)
    public void firstAndLastNameIsInvalid() throws BadNameException {
        String fName = "Mi";
        String lName = "Pe";

        User u = new User();

        u.setFirstName(fName);
        u.setLastName(lName);
    }

    @Test(expected = NullPointerException.class)
    public void firstAndLastNameIsNull() throws BadNameException {
        String fName = null;
        String lName = null;

        User u = new User();

        u.setFirstName(fName);
        u.setLastName(lName);
    }

}
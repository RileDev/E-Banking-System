import classes.user.User;
import exceptions.BadEmailException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setEmail() {
        String example = "yourmail@mail.com";
        User u = new User();
        try {
            u.setEmail(example);
        } catch (BadEmailException e) {
            throw new RuntimeException(e);
        }

        assertEquals(example, u.getEmail());
    }

    @Test(expected = BadEmailException.class)
    public void setEmailWithoutMonkeyChar() throws BadEmailException {
        String example = "yourmailmail.com";
        User u = new User();

        u.setEmail(example);
    }

    @Test(expected = BadEmailException.class)
    public void setEmailWithoutDotChar() throws BadEmailException {
        String example = "yourmail@mail";
        User u = new User();

        u.setEmail(example);
    }
}
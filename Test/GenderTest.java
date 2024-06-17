import classes.user.User;
import exceptions.BadGenderException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setMale() throws BadGenderException {
        String expect = "male";
        User u = new User();

        u.setGender(expect);

        assertEquals(expect, u.getGender());
    }

    @Test
    public void setMaleWithUppercase() throws BadGenderException {
        String input = "MALE";
        User u = new User();
        String expect = "male";

        u.setGender(input);

        assertEquals(expect, u.getGender());
    }

    @Test
    public void setFemale() throws BadGenderException {
        String expect = "female";
        User u = new User();

        u.setGender(expect);

        assertEquals(expect, u.getGender());
    }

    @Test
    public void setFemaleWithUppercase() throws BadGenderException {
        String input = "FEMALE";
        User u = new User();
        String expect = "female";

        u.setGender(input);

        assertEquals(expect, u.getGender());
    }

    @Test(expected = BadGenderException.class)
    public void setInvalidGender() throws BadGenderException {
        String expect = "robot";
        User u = new User();

        u.setGender(expect);
    }

    @Test(expected = NullPointerException.class)
    public void setNullGender() throws BadGenderException {
        String expect = null;
        User u = new User();

        u.setGender(expect);
    }
}
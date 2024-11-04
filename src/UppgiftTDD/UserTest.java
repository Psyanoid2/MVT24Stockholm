package UppgiftTDD;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testUserName() {
        // Create a User instance
        User user = new User("admin");

        // Verify that the username is set correctly
        assertEquals("admin", user.getUserName(), "Username should be 'admin'");
    }

    @Test
    void testPassWord() {
        // Create a Pass instance
        User.Pass pass = new User.Pass("admin123");

        // Verify that the password is set correctly
        assertEquals("admin123", pass.getPassWord(), "Password should be 'admin123'");
    }

    @Test
    void testUserAndPasswordCombination() {
        // Create both User and Pass instances
        User user = new User("admin");
        User.Pass pass = new User.Pass("admin123");

        // Verify that both username and password match expectations
        assertEquals("admin", user.getUserName(), "Username should be 'admin'");
        assertEquals("admin123", pass.getPassWord(), "Password should be 'admin123'");
    }
}
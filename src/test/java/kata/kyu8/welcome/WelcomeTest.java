package kata.kyu8.welcome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeTest {
    @Test
    public void exampleTest() {
        assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Welcome.greet("dutch"));
        assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
    }

    @Test
    public void english(){
        assertEquals("Your function should have returned 'Welcome'. Try again.","Welcome", Welcome.greet("english"));

    }
}
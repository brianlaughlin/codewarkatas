package kata.regexp.isdigit.strangetiptomarket;

import org.junit.Test;

import static org.junit.Assert.*;

public class NessieTest {


    @Test
    public void testBasicTrue() {
        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(n);
        assertTrue(Nessie.isLockNessMonster(n));
    }
    @Test
    public void testBasicFalse() {
        String n = "Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.";
        System.out.println(n);
        assertFalse(Nessie.isLockNessMonster(n));
    }

    @Test
    public void testTrue(){
        String n = "Aloha, please come closer, see the tree fiddy, and enjoy life!";
        System.out.println(n);
        assertTrue(Nessie.isLockNessMonster(n));
    }

}
package kata.kyu8.Iloveyoualittlealotpetals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SidTest {
    @Test
    public void test1() {
        assertEquals("I love you", Sid.howMuchILoveYou(1));
        assertEquals("a little", Sid.howMuchILoveYou(2));
        assertEquals("not at all", Sid.howMuchILoveYou(6));
    }
}
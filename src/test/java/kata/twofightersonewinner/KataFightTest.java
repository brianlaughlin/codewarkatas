package kata.twofightersonewinner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataFightTest {

    @Test
    public void basicTests() {
        assertEquals("Lew", KataFight.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));

    }

    @Test
    public void name7() throws Exception {
        assertEquals("Harald", KataFight.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }

    @Test
    public void name2() throws Exception {
        assertEquals("Harry", KataFight.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
    }

    @Test
    public void name4() throws Exception {
        assertEquals("Harald", KataFight.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
    }

    @Test
    public void name5() throws Exception {
        assertEquals("Harald", KataFight.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
    }
}
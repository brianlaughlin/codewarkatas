package kata.kyu8.cantsleepsheep;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void testSomething() {
        assertEquals("1 sheep...", Kata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));
    }
}
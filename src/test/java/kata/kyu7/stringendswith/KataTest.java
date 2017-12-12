package kata.kyu7.stringendswith;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void testSomething() {
         assertEquals(true, Kata.solution("abc", "bc"));
        assertEquals(false, Kata.solution("abc", "d"));
    }
}
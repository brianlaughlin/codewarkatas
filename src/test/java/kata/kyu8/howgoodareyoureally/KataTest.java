package kata.kyu8.howgoodareyoureally;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KataTest {

    @Test
    public void tests() {
        assertTrue(Kata.betterThanAverage(new int[] {2, 3}, 5));
        assertTrue(Kata.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertFalse(Kata.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 9));
    }

}
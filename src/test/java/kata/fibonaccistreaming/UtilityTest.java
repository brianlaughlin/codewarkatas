package kata.fibonaccistreaming;

import org.junit.Test;

import java.util.PrimitiveIterator;

import static org.junit.Assert.*;

public class UtilityTest {
    @Test
    public void testThatTheFirstTwentyElementsAreCorrect() {
        assertArrayEquals("The first twenty elements are incorrect!",
                new int[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765},
                Utility.generateFibonacciSequence().limit(20).toArray());
    }

    @Test(timeout = 30)
    public void testRecursivePropertyInStreamByRandomLeaps() {
        for (int i = 0; i < 3; i++) { // Repeat three times
            final PrimitiveIterator.OfInt iterator =
                    Utility.generateFibonacciSequence()
                            .skip((int) (Math.random() * 900)) // Begin leap
                            .limit(20) // End leap
                            .iterator();
            int previous = iterator.nextInt(),
                    current = iterator.nextInt();
            while (iterator.hasNext()) {
                final int next = iterator.next();
                if (next != previous + current)
                    fail(String.format("Elements %s, %s are followed by %s!", previous, current, next));
                previous = current;
                current = next;
            }
        }
    }
}
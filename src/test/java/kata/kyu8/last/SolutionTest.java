package kata.kyu8.last;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testList() {
        final List<Integer> list = Arrays.asList(1, 2 ,3 ,4 ,5);
        final int last = Solution.last(list);
        assertEquals(5, last);
    }
    @Test public void testString() {
        final String string = "abcde";
        final char last = Solution.last(string);
        assertEquals('e', last);
    }
    @Test public void testArgs() {
        final int last = Solution.last(1, 2 ,3 ,4 ,5);
        assertEquals(5, last);
    }
    @Test public void testArray() {
        final Integer[] array = {1, 2 ,3 ,4 ,5};
        final int last = Solution.last(array);
        assertEquals(5, last);
    }
}
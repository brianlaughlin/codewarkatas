package kata.reversedwords;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {


    @Test
    public void testSomething() {
        assertEquals(ReverseWords.reverseWords("I like eating"), "eating like I");
    }

    @Test
    public void testSomething2() {
        assertEquals(ReverseWords.reverseWords("I like flying"), "flying like I");
    }

    @Test
    public void testSomething3() {
        assertEquals(ReverseWords.reverseWords("The world is nice"), "nice is world The");
    }
}
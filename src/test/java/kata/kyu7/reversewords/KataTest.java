package kata.kyu7.reversewords;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void testReverseWords() throws Exception {
        String result = Kata.reverseWords("original");
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", Kata.reverseWords("apple"));
        assertEquals("a b c d", Kata.reverseWords("a b c d"));
        assertEquals("4321    98765     edcba", Kata.reverseWords("1234    56789     abcde"));
        assertEquals("elbuod  decaps  sdrow", Kata.reverseWords("double  spaced  words"));
    }

    @Test
    public void useStack() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWordsStack("The quick brown fox jumps over the lazy dog."));
        assertEquals("a b c d", Kata.reverseWordsStack("a b c d"));
        assertEquals("4321    98765     edcba", Kata.reverseWordsStack("1234    56789     abcde"));
    }
}

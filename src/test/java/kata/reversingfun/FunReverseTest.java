package kata.reversingfun;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunReverseTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests funReverse");
        testing(FunReverse.funReverse("012"), "201");
        testing(FunReverse.funReverse("012345"), "504132");
        testing(FunReverse.funReverse("0123456789"), "9081726354");
        testing(FunReverse.funReverse("Hello"), "oHlel");
        testing(FunReverse.funReverse("4ppso1vdjc9rjyf5bkmd5nztr8"), "84rptpzsno51dvmdkjbc59fryj");
    }

    @Test
    public void reverse2(){
        testing(FunReverse.funReverse("12"), "21");
        testing(FunReverse.funReverse("012"), "201");
    }
}
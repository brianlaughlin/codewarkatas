package kata.playground;

import org.junit.Test;

import static kata.playground.TestingStuff.summation;
import static org.junit.Assert.*;

public class TestingStuffTest {

    public TestingStuff t = new TestingStuff();

    @Test
    public void printerError() throws Exception {
        TestingStuff testClass = new TestingStuff();

        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", testClass.printerError(s));

    }

    @Test
    public void test(){
        assertEquals(1, summation(1));
    }

}
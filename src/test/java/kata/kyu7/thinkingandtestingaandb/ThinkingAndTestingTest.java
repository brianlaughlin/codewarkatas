package kata.kyu7.thinkingandtestingaandb;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThinkingAndTestingTest {

    @Test
    public void exampleSumTests() {
        // a + b?
        assertEquals(1, ThinkingAndTesting.testAB(0, 1));
        assertEquals(3, ThinkingAndTesting.testAB(1, 2));
        assertEquals(30, ThinkingAndTesting.testAB(10, 20));
    }

    @Test
    public void exampleProductTests() {
        // a * b?
        assertEquals(1, ThinkingAndTesting.testAB(1, 1));
        assertEquals(3, ThinkingAndTesting.testAB(1, 3));
    }

    @Test
    public void fixedTest1(){
        assertEquals(2, ThinkingAndTesting.testAB(2,2));
    }

    @Test
    public void randomTest(){
        assertEquals(638, ThinkingAndTesting.testAB(558, 88));
    }

    @Test
    public void clue(){
        assertEquals(30, ThinkingAndTesting.testAB(10, 20));
    }
}
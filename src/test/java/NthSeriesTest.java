import static org.junit.Assert.*;

import kata.nthseries.Kata;
import org.junit.Test;

public class NthSeriesTest {

    @org.junit.Test
    public void test1() {
        assertEquals(Kata.seriesSum(5), "1.57");
    }
    @Test
    public void test2() {
        assertEquals(Kata.seriesSum(9), "1.77");
    }
    @Test
    public void test3() {
        assertEquals(Kata.seriesSum(15), "1.94");
    }

    @Test
    public void test4(){
        assertEquals(Kata.seriesSum(1), "1.00");
    }

    @Test
    public void test5(){
        assertEquals(Kata.seriesSum(78), "2.50");
    }

}
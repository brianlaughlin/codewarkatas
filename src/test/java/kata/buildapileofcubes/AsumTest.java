package kata.buildapileofcubes;

import org.junit.Test;

import static org.junit.Assert.*;

public class AsumTest {
    @Test
    public void test1() {
        assertEquals(2022, Asum.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, Asum.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, Asum.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, Asum.findNb(40539911473216L));
    }


    @Test
    public void test5UsingDouble(){
        assertEquals(55100, Asum.findNBDouble(304422822859502500L));
    }

    //Wolfram - wrong?
    @Test
    public void test6(){
        assertEquals(55100, Asum.findNbBest(304422822859502500L));
    }

    @Test
    public void test7(){
        assertEquals(54611, Asum.findNb(2223701197861857156L));
    }

    @Test
    public void testFailed1(){
        Asum.findNbFailed1(54611);
    }
}
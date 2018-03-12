package kata.kyu8.findtheslope;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlopeTest {
    @Test
    public void test1()
    {
        int[] test1={19,3,20,3};
        Slope s=new Slope();
        assertEquals("0",s.slope(test1));

        /*
        Tests are malformed
         */
//        assertEquals("undefined",s.slope([-7,2,-7,4]));
//        assertEquals("5",s.slope([10,50,30,150]));
//        assertEquals("-5",s.slope([15,45,12,60]));
//        assertEquals("6",s.slope([10,20,20,80]));
//        assertEquals("undefined",s.slope([-10,6,-10,3]));
    }
}
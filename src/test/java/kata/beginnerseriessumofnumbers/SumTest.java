package kata.beginnerseriessumofnumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));

    }

    @Test
    public void Test2(){
        assertEquals(1, s.GetSum(0, 1));
    }

}
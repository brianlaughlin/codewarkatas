package kata.busmasteringwhoisthemostpriority;

import org.junit.Test;

import static kata.busmasteringwhoisthemostpriority.BusMastering.*;
import static org.junit.Assert.*;

public class BusMasteringTest {
    @Test
    public void basicTests() {
        assertEquals(arbitrate("001000101", 9), "001000000");


    }

    @Test
    public void Test2(){
        assertEquals(arbitrate("000000101", 9), "000000100");
    }

    @Test
    public void Test3(){
        assertEquals(arbitrate("0000", 4), "0000");
    }

    @Test
    public void Test4(){
        assertEquals(arbitrate("0", 1), "0");
        assertEquals(arbitrate("00", 2), "00");

        assertEquals(arbitrate("001", 3), "001");
    }

    @Test
    public void TestNotworking1(){
        assertEquals(arbitrate("11", 2), "10");
    }
}
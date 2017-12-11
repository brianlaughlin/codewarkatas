package kata.weightforweight;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkingTest {

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", Working.orderWeightBest("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

}
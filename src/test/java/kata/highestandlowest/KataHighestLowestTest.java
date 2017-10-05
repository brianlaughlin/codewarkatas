package kata.highestandlowest;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataHighestLowestTest {
    @Test
    public void highAndLow() throws Exception {
        assertEquals("42 -9", KataHighestLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void highAndLow2() throws Exception{
        assertEquals("777 -8", KataHighestLowest.HighAndLow("2 9 55 44 776 777 -2 -3 99 100 -8 11 23 44"));
    }

    @Test
    public void HighAndLowBetter() throws Exception {
        assertEquals("42 -9", KataHighestLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void highAndLowBest() throws Exception {
        assertEquals("42 -9", KataHighestLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }



}
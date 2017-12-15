package kata.findtheuniquenumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, Kata.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }


    @Test
    public void findOne(){
        assertEquals(1.0, Kata.findUniq(new double[]{0, 1, 0}), precision);
    }


}


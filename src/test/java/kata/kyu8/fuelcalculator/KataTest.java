package kata.kyu8.fuelcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void test1(){
        assertEquals(5.65d, Kata.fuelPrice(5, 1.23d), 0.001d);
    }


    @Test
    public void exampleTests(){
        assertEquals(5.65d, Kata.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, Kata.fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, Kata.fuelPrice(5, 5.6d),  0.001d);
    }

    @Test
    public void random1(){
        assertEquals(3144.6d, Kata.fuelPrice(180, 17.72d), 0.001d);

    }

}
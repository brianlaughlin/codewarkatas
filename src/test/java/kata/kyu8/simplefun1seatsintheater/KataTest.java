package kata.kyu8.simplefun1seatsintheater;

import org.junit.Test;

import static org.testng.Assert.*;

public class KataTest {

    @Test
    public void exampleTests() {
        assertEquals(96, Kata.seatsInTheater(16,11,5,3));
        assertEquals(0, Kata.seatsInTheater(1,1,1,1));
        assertEquals(18, Kata.seatsInTheater(13,6,8,3));
        assertEquals(99, Kata.seatsInTheater(60,100,60,1));
        assertEquals(0, Kata.seatsInTheater(1000,1000,1000,1000));
    }

    @Test
    public void test1(){
        assertEquals(96, Kata.seatsInTheater(16,11,5,3));
    }

    @Test
    public void test2(){
        assertEquals(0, Kata.seatsInTheater(1000,1000,1000,1000));
    }
}



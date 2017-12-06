package kata.kyu8.sumwithouthighestandlowestnumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void BasicTests() {
        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
    }

    @Test
    public void NullTest(){
        assertEquals(0, Kata.sum(null));
    }

}
package kata.kyu8.subtractthesum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void basicTest() {
        assertEquals("apple", Kata.subtractSum(10));

    }

    @Test
    public void largerNumber(){
        assertEquals("apple", Kata.subtractSum(2402));
    }

    @Test
    public void largerNumber709(){
        assertEquals("apple", Kata.subtractSum(709));
    }
}
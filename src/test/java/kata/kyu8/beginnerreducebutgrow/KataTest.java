package kata.kyu8.beginnerreducebutgrow;

import org.junit.Test;

import static org.testng.Assert.*;

public class KataTest {

    @Test
    public void testSomething() {
        assertEquals(6, Kata.grow(new int[]{1,2,3}));
        assertEquals(16, Kata.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, Kata.grow(new int[]{2,2,2,2,2,2}));
    }

    @Test
    public void Test1(){
        assertEquals(16, Kata.grow(new int[]{4,1,1,1,4}));
        assertEquals(6, Kata.grow(new int[]{1,2,3}));
    }

}
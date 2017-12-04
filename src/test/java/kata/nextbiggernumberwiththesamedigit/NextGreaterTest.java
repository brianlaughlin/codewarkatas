package kata.nextbiggernumberwiththesamedigit;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterTest {
    @Test
    public void basicTests() {
        assertEquals(21, Kata.nextBiggerNumber(12));
        assertEquals(531, Kata.nextBiggerNumber(513));
        assertEquals(2071, Kata.nextBiggerNumber(2017));

        assertEquals(java.util.Optional.of(414), NextGreater.findNext((long) 144));
    }

    @Test
    public void test1(){
        assertEquals(1057861850L, NextGreater.findNext(1057861805L));
    }

    @Test
    public void test2(){
        assertEquals(21, NextGreater.findNext(12));
    }
}
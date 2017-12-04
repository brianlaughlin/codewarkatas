package kata.nextbiggernumberwiththesamedigit;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void basicTests() {
        assertEquals(21, Kata.nextBiggerNumber(12));
        assertEquals(531, Kata.nextBiggerNumber(513));
        assertEquals(2071, Kata.nextBiggerNumber(2017));

        assertEquals(414, Kata.nextBiggerNumber(144));
    }

    @Test
    public void test1(){
        assertEquals(1057861850, Kata.nextBiggerNumber(1057861805));
    }
}
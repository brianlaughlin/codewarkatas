package kata.nextbiggernumberwiththesamedigit;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataFasterTest {
    @Test
    public void basicTests() {
        assertEquals(21, KataFaster.nextBiggerNumber(12));
        assertEquals(531, KataFaster.nextBiggerNumber(513));
        assertEquals(2071, KataFaster.nextBiggerNumber(2017));

        assertEquals(414, KataFaster.nextBiggerNumber(144));
    }

    @Test
    public void test1(){
        assertEquals(1057861850, KataFaster.nextBiggerNumber(1057861805));
    }

    @Test
    public void test2(){
        assertEquals(2071, KataFaster.nextBiggerNumber(2017));
    }

    @Test
    public void test3(){
        assertEquals(123456785123446789L, KataFaster.nextBiggerNumber(123456784987654321L));
    }

}
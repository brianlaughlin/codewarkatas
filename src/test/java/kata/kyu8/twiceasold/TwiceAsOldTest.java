package kata.kyu8.twiceasold;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwiceAsOldTest {
    @Test
    public void testSomething() {
        assertEquals(TwiceAsOld.TwiceAsOld(30,0), 30);
        assertEquals(TwiceAsOld.TwiceAsOld(30,7), 16);
        assertEquals(TwiceAsOld.TwiceAsOld(45,30), 15);

    }

    @Test
    public void test1(){
        assertEquals(TwiceAsOld.TwiceAsOld(30,0), 30);
    }

    @Test
    public void test2(){
        assertEquals(TwiceAsOld.TwiceAsOld(30,7), 16);
    }

    @Test
    public void test3(){
        assertEquals(TwiceAsOld.TwiceAsOld(45,30), 15);
    }

    @Test
    public void test4Lame(){
        assertEquals(TwiceAsOld.TwiceAsOld(94,106), 118);
    }
}
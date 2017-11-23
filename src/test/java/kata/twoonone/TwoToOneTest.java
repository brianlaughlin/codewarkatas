package kata.twoonone;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoToOneTest {
    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }

    @Test
    public void test1(){
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
    }
}
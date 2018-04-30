package kata.kyu7.antistring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JomoPipiTest {


   // 48 to 57 = 0 to 9
    @Test
    public void oneNumber(){
        assertEquals("99", JomoPipi.antiString("00"));
    }

    @Test
    public void letters(){
        assertEquals("ZZ", JomoPipi.antiString("aa"));
    }


    @Test
    public void Basic1() {
        assertEquals("a0", JomoPipi.antiString("9Z"));
    }
    @Test
    public void Basic2() {
        assertEquals("aBc123", JomoPipi.antiString("678XyZ"));
    }
    @Test
    public void Basic3() {
        assertEquals("678bcdXYZ", JomoPipi.antiString("abcWXY123"));
    }
}
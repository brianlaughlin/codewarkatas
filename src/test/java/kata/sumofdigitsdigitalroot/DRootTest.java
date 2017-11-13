package kata.sumofdigitsdigitalroot;

import org.junit.Test;

import static org.junit.Assert.*;

public class DRootTest {
    @Test
    public void Tests() {
        assertEquals( "Nope!" , DRoot.digital_root(16), 7);
    }

    @Test
    public void Test1(){
        assertEquals("No", DRoot.digital_root(493193), 2);
    }

    @Test
    public void Test2(){
        assertEquals("No", DRoot.digital_root(493029233), 8);
    }
}
package kata.dontgivemefive;

import org.junit.Test;

import static org.junit.Assert.*;

public class DontGiveMeFiveTest {
    @Test
    public void dontGiveMeFive() throws Exception {

        assertEquals(8, DontGiveMeFive.dontGiveMeFive(1,9));
        assertEquals(12, DontGiveMeFive.dontGiveMeFive(4,17));
    }

    @Test
    public void negativenumbers() throws Exception {

        assertEquals(5, DontGiveMeFive.dontGiveMeFive(-6,-1));
        assertEquals(16, DontGiveMeFive.dontGiveMeFive(-6,11));
    }


}
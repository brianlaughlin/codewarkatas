package kata.describealist;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void describeList() throws Exception {
    }

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals("empty", Kata.describeList(Arrays.asList(new Object[0])));
        assertEquals("singleton", Kata.describeList(Arrays.asList(1)));
        assertEquals("longer", Kata.describeList(Arrays.asList(1,2)));
        assertEquals("empty", Kata.describeList(Arrays.asList(new Object[0])));
        assertEquals("singleton", Kata.describeListBetter(Arrays.asList(1.5)));
        assertEquals("longer", Kata.describeListBetter(Arrays.asList(1.5,2.5)));
    }

}
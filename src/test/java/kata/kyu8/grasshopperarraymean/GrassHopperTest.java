package kata.kyu8.grasshopperarraymean;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper.findAverage(new int[]{1}));
    }
    @Test
    public void test2() {
        assertEquals(4,
                GrassHopper.findAverage(new int[]{1,3,5,7}));
    }
}
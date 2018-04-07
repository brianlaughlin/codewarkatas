package kata.kyu8.grasshopperdebug;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopperTest {
    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", GrassHopper.weatherInfo(50));
    }
    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", GrassHopper.weatherInfo(23));
    }

    @Test
    public void testHighPercission() {
        assertEquals("33.888888888888886 is above freezing temperature", GrassHopper.weatherInfo(93));
    }

}
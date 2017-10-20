package kata.converttimetostring;

import org.junit.Test;

import static org.junit.Assert.*;

public class TimeUtilsTest {


    @Test
    public void shouldConvertCorrectly() throws Exception {
        assertEquals("1 1 1 1", TimeUtils.convertTime(90061));
        assertEquals("-1 -1 -1 -1", TimeUtils.convertTime(-90061));
    }

    @Test
    public void secOnly() throws Exception {
        assertEquals("0 0 0 24", TimeUtils.convertTime(24));
    }

    @Test
    public void minAndSec() throws Exception {
        assertEquals("0 0 1 7", TimeUtils.convertTime(67));
    }

}
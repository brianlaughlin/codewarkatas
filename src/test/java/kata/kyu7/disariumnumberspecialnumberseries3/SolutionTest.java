package kata.kyu7.disariumnumberspecialnumberseries3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void Disarium_Or_NOT()
    {
        assertEquals("Disarium !!", Solution.disariumNumber(89));
        assertEquals("Not !!", Solution.disariumNumber(564));
        assertEquals("Not !!", Solution.disariumNumber(1024));
    }
    @Test
    public void Larger_Numbers()
    {
        assertEquals("Not !!", Solution.disariumNumber(64599));
        assertEquals("Not !!", Solution.disariumNumber(136586));
        assertEquals("Not !!", Solution.disariumNumber(1048576));
    }

}
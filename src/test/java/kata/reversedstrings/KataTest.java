package kata.reversedstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", Kata.solution("world"));
    }

    @Test
    public void sampleTests2() {
        assertEquals("dlrow", Kata.solutionBetter("world"));
    }

}
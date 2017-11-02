package kata.multiplesof3and5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(23, new Solution().solution(10));
    }

    @Test
    public void test2() {
        assertEquals(23, new Solution().solutionStream((10)));
    }

}
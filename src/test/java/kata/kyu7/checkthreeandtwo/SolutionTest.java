package kata.kyu7.checkthreeandtwo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Test
    public void hasDuplicates(){
        assertTrue(new Solution().checkThreeAndTwo(new char[]{'a', 'a', 'b', 'b', 'b'}));
    }

    @Test
    public void testSomething() {
        assertEquals(true, new Solution().checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        assertEquals(false, new Solution().checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        assertEquals(false, new Solution().checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }


}
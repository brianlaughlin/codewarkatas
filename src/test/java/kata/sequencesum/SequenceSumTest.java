package kata.sequencesum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceSumTest {
    SequenceSum sequenceSum = new SequenceSum();

    @Test
    public void testKnownValues() {
        assertArrayEquals(new int[]{0, 1, 3, 6}, SequenceSum.sumOfN(3));
        assertArrayEquals(new int[]{0, -1, -3, -6, -10}, SequenceSum.sumOfN(-4));
        assertArrayEquals(new int[]{0, 1}, SequenceSum.sumOfN(1));
        assertArrayEquals(new int[]{0}, SequenceSum.sumOfN(0));
    }

    @Test
    public void test1(){
        assertArrayEquals(new int[]{0, 1, 3, 6}, SequenceSum.sumOfN(3));
    }

    @Test
    public void testZero(){
        assertArrayEquals(new int[]{0}, SequenceSum.sumOfN(0));
    }

    @Test
    public void negative(){
        assertArrayEquals(new int[]{0, -1, -3, -6, -10}, SequenceSum.sumOfNBetter(-4));
    }

}
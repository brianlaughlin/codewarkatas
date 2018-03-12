package kata.kyu8.howdoicomparenumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowDoICompareTest {
    @Test
    public void test() throws Exception {
        for (Object[] t: tests)
            assertEquals(t[1], HowDoICompare.whatIs((Integer)t[0]));
    }

    static final Object[][] tests = {
            {0, "nothing"},
            {123, "nothing"},
            {-1, "nothing"},
            {42, "everything"},
            {42 * 42, "everything squared"},
    };
}
package kata.playground;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestingStuffTest {

    public TestingStuff t = new TestingStuff();


    @Test
    public void multiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }


    @Test
    public void oddOrEvenTest() {
        TestingStuff t = new TestingStuff();

        t.oddOrEven();


    }
}
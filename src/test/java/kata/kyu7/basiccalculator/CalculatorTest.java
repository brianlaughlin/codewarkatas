package kata.kyu7.basiccalculator;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    @Test
    public void BasicTest() {
        assertEquals("3.2 + 8 = 11.2", new Double(11.2), Calculator.calculate(3.2, "+", 8));
        assertEquals("3.2 - 8 = -4.8", new Double(-4.8), Calculator.calculate(3.2, "-", 8));
        assertEquals("3.2 / 8 = .4", new Double(0.4), Calculator.calculate(3.2, "/", 8));
        assertEquals("3.2 * 8 = 25.6", new Double(25.6), Calculator.calculate(3.2, "*", 8));
        assertEquals("-3 + 0 = -3", new Double(-3), Calculator.calculate(-3, "+", 0));
        assertEquals("-3 - 0 = -3", new Double(-3), Calculator.calculate(-3, "-", 0));
        assertEquals("-3 / 0 = null", null, Calculator.calculate(-3, "/", 0));
        assertEquals("-2 / -2 = 1", new Double(1), Calculator.calculate(-2, "/", -2));
        assertEquals("-3 * 0 = 0", new Double(0), Calculator.calculate(-3, "*", 0));
        assertEquals("-3 w 0 = null", null, Calculator.calculate(-3, "w", 0));
    }
}

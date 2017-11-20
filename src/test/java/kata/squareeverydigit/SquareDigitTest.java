package kata.squareeverydigit;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
    }

    @Test
    public void test2() {
        assertEquals(811181, new SquareDigit().squareDigitStream(9119));
    }
}
package kata.sumofoddnumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class RowSumOddNumbersTest {


    @Test
    public void test1() {
        assertEquals(74088, RowSumOddNumbers.rowSumOddNumbers(42));
    }

    @Test
    public void test2() {
        assertEquals(1, RowSumOddNumbers.rowSumOddNumbers(1));
    }

    @Test
    public void test3() {
        assertEquals(64, RowSumOddNumbers.rowSumOddNumbers(4));
    }

    @Test
    public void test4() {
        assertEquals(27, RowSumOddNumbers.rowSumOddNumbers(3));
    }
}
package kata.kyu7.strongnstrongnumberspeialnumbersseries2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrongNumberTest {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    @Test
    public void test1(){
        assertEquals(STRONG, StrongNumber.isStrongNumber(1));
        assertEquals(STRONG, StrongNumber.isStrongNumber(2));
    }

    @Test
    public void test2(){
        assertEquals(STRONG, StrongNumber.isStrongNumber(145));
    }

    @Test
    public void testSomething() {


        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }

    @Test
    public void isStrongNumberStream() {
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }
}
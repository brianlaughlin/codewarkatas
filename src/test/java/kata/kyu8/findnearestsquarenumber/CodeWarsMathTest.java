package kata.kyu8.findnearestsquarenumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeWarsMathTest {
    @Test
    public void basicTests() {
        assertEquals(1, CodeWarsMath.nearestSq(1));
        assertEquals(1, CodeWarsMath.nearestSq(2));


        assertEquals(10000, CodeWarsMath.nearestSq(9999));
    }

    @Test
    public void Test1() {
        assertEquals(9, CodeWarsMath.nearestSq(10));
    }

    @Test
    public void Test2() {
        assertEquals(121, CodeWarsMath.nearestSq(111));
    }

}
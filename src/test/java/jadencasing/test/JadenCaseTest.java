package jadencasing.test;

import kata.jadencasing.JadenCase;
import kata.jadencasing.JadenCase2;
import org.junit.Test;

import static org.junit.Assert.*;

public class JadenCaseTest {

    JadenCase jadenCase = new JadenCase();
    JadenCase2 jadenCase2 = new JadenCase2();

    @Test
    public void test() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", jadenCase.toJadenCase("most trees are blue"), "Most Trees Are Blue");
    }

    @Test
    public void testNullArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(""));
    }

    @Test
    public void test2() {
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)", jadenCase2.toJadenCase("most trees are blue"), "Most Trees Are Blue");
    }

    @Test
    public void test2NullArg() {
        assertNull("Must return null when the arg is null", jadenCase2.toJadenCase(null));
    }

    @Test
    public void test2EmptyArg() {
        assertNull("Must return null when the arg is null", jadenCase2.toJadenCase(""));
    }



}
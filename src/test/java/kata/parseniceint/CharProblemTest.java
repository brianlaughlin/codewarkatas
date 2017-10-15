package kata.parseniceint;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharProblemTest {


    @Test
    public void test1() {
        assertEquals(5, CharProblem.howOld("5 years old"));
    }
    @Test
    public void test2() {
        assertEquals(9, CharProblem.howOld("9 years old"));
    }
    @Test
    public void test3() {
        assertEquals(1, CharProblem.howOld("1 year old"));
    }

    @Test
    public void test4() {
        assertEquals(9, CharProblem.howOld1("9 years old"));
    }

    @Test
    public void test5() {
        assertEquals(9, CharProblem.howOld2("9 years old"));
    }

    @Test
    public void test6() {
        assertEquals(9, CharProblem.howOld3("9 years old"));
    }

    @Test
    public void test7(){
        assertEquals(8, CharProblem.howOld("Me is 8 years old!"));
    }

    @Test
    public void test8(){
        assertEquals(8, CharProblem.howOld1("Me is 8 years old!"));
    }

    @Test
    public void test9(){
        assertEquals(8, CharProblem.howOld2("Me is 8 years old!"));
    }

    @Test
    public void test10(){
        assertEquals(8, CharProblem.howOld3("Me is 8 years old!"));
    }

}
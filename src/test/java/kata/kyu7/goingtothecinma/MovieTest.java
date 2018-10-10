package kata.kyu7.goingtothecinma;

import org.junit.Test;

import static org.testng.Assert.*;

public class MovieTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");
        testing(Movie.movie(500, 15, 0.9), 43);
        testing(Movie.movie(100, 10, 0.95), 24);
        testing(Movie.movie(500, 20, 0.90), 34);
    }

    @Test
    public void test2(){
        testing(Movie.movie(500, 15, 0.9), 43);
    }

    @Test
    public void testCard0(){
        testing(Movie.movie(0, 10, 0.95), 2);
    }

    @Test
    public void testCard2500(){
        testing(Movie.movie(2500, 20, 0.90), 135);
    }
}
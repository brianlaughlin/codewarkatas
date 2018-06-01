package kata.kyu7.floatingpointapproximation3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadraticTest {

    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static void assertFuzzyEquals(double a, double b, double c){
        double merr = 1e-12;
        System.out.println("Testing " + a + ", " + b + ", " + c);
        double x = Quadratic.quadratic(a, b, c);
        boolean smallest = Math.abs(x) < 1.e-1;
        if (smallest == false) {
            System.out.println("This root is not the good one");
        }
        double actual = a * x * x + b * x + c;
        boolean inrange = Math.abs(actual) <= merr;
        if (inrange == false)
            System.out.println("Expected must be near " + 0.0 +", got " + actual);
        boolean correct = smallest && inrange;
        assertEquals(true, correct);
    }
    @Test
    public void test1() {
        assertFuzzyEquals(7, 4.00e+13, 8);
        assertFuzzyEquals(9, 1.00e+14, 1);
        assertFuzzyEquals(3, 3.00e+09, 1);
        assertFuzzyEquals(7, 4.00e+09, 7);

    }
}
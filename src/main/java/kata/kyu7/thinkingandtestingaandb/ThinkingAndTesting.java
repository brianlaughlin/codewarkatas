package kata.kyu7.thinkingandtestingaandb;

public class ThinkingAndTesting {
    public static int testAB(int a, int b) {

        int bitWiseValue = a & b;
        return a + b - bitWiseValue;
    }

    public static int testABBetterVersion(int a, int b) {
        /*
         * Since the expected values for the test cases do
         * not work with basic arithmentic operators. Lets
         * use bitwise operators.
         *
         * If we look at the input and output integer values
         * as 8 bit values, we can see that the operator being
         * used is an '|' (bitwise or).
         *
         * e.g.
         *        a:  0000 1010 base 2  (10 decimal)
         *        b:  0001 0100 base 2  (20 decimal)
         *   output:  0001 1110 base 2  (30 decimal)
         */
        return a | b;
    }
}

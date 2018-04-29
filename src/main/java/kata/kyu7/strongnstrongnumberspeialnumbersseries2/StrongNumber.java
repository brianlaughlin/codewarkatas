package kata.kyu7.strongnstrongnumberspeialnumbersseries2;

import java.util.stream.IntStream;

public class StrongNumber {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    public static String isStrongNumber(int num) {

        return (getSumEachDigit(num) == num) ? STRONG : NOT_STRONG;
    }

    private static int getSumEachDigit(int num) {
        int n = num;
        int sumEachDigit = 0;
        while (n > 0) {
            int d = n / 10;
            int k = n - d * 10;
            n = d;
            sumEachDigit += factorial(k);
        }
        return sumEachDigit;
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact += fact * i;
        }
        return fact;
    }

    public static String isStrongNumberStream(int num) {
        return String.valueOf(num).chars()
                .map(i-> IntStream.range(1, i-'0'+1).reduce(1, (p, v)->p*v))
                .sum() == num ? "STRONG!!!!" : "Not Strong !!";
    }
}


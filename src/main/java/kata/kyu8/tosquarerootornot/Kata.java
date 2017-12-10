package kata.kyu8.tosquarerootornot;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int[] squareOrSquareRoot(int[] array)
    {
        int[] newArray = new int[array.length];

        int bound = array.length;
        for (int i = 0; i < bound; i++) {
            if (isPerfectSquare(array[i])) {
                newArray[i] = (int) Math.sqrt(array[i]);
            } else {
                newArray[i] = (int) Math.pow(array[i], 2);
            }
        }
        return newArray;
    }

    private static boolean isPerfectSquare(int i) {
        double sqrt = Math.sqrt(i);
        int x = (int) sqrt;
        if(Math.pow(sqrt, 2) == Math.pow(x, 2)) return true;
        else return false;
    }

    public static int[] squareOrSquareRootStream(int[] array)
    {
        return Arrays.stream(array)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
                .toArray();
    }
}


package kata.sumofoddcubednumbers;

import java.util.Arrays;

public class FindOddCubes {
    public static int cubeOdd(int arr[]) {

        int result = Arrays.stream(arr)
                .map(i -> (int) Math.pow(i, 3))
                .filter(n -> n % 2 != 0)
                .sum();

        return result;
    }
}

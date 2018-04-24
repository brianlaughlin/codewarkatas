package kata.kyu8.grasshopperarraymean;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GrassHopper {
    public static int findAverage(int[] nums) {

        int result = Arrays.stream(nums).sum();
        return (int) result / nums.length;
    }

    public static int findAverageStreamOneLine(int[] nums) {
        return IntStream.of(nums).sum() / nums.length;
    }
}

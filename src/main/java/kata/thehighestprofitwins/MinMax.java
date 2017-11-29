package kata.thehighestprofitwins;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinMax {
    public static int[] minMax(int[] arr) {
        OptionalInt max = IntStream.of(arr).max();
        OptionalInt min = IntStream.of(arr).min();

        return new int[]{min.getAsInt(), max.getAsInt()};
    }

    public static int[] minMaxCleaver(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0],arr[arr.length-1]};
    }
}

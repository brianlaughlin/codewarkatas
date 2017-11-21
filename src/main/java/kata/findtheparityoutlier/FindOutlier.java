package kata.findtheparityoutlier;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindOutlier {
    static int find(int[] integers) {
        int evenCount = 0;
        evenCount = (int) IntStream.of(integers)
                .filter(e -> Math.abs(e) % 2 == 0)
                .count();

        if (evenCount == 1) {
            return IntStream.of(integers)
                    .filter(e -> Math.abs(e) % 2 == 0)
                    .findFirst()
                    .orElse(0);
//                    .getAsInt();
        } else {
            return IntStream.of(integers)
                    .filter(e -> e % 2 == 1)
                    .findAny()
                    .orElse(0);
//                    .getAsInt();
//                    .orElse(0);
//                    .getAsInt();
        }
    }

    public static int findSolution(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }

    static int findSimple(int[] integers) {
        int[] array = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();
        return array.length == 1 ? array[0] : Arrays.stream(integers).filter(i -> i % 2 != 0).findAny().getAsInt();
    }
}
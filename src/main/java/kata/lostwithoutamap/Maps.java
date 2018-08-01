package kata.lostwithoutamap;

import java.util.Arrays;

public class Maps {
    public static int[] map(int[] arr) {

        return Arrays
                .stream(arr)
                .map(i -> i * 2)
                .toArray();
    }
}


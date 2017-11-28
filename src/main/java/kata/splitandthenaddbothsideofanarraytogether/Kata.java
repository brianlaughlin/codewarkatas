package kata.splitandthenaddbothsideofanarraytogether;

import java.util.Arrays;

public class Kata {
    public static int[] splitAndAdd(int[] numbers, int n) {
        int[] arr = Arrays.copyOf(numbers, numbers.length);
        while (arr.length > 1 && n-- > 0) {
            int[] tmp = Arrays.copyOfRange(arr, arr.length/2, arr.length);
            for (int i = 0 ; i < arr.length/2 ; i++) tmp[i + arr.length%2] += arr[i];
            arr = tmp;
        }
        return arr;
    }
}


// Another way to copy the array is     System.arraycopy();
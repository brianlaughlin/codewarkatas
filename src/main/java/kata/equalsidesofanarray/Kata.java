package kata.equalsidesofanarray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static int findEvenIndex(int[] arr) {

        int right = 0;
        int left = 0;

        int counterPointer = 1;
        if (arr.length == 0) return 0;

        for (int all = 0; all < arr.length; all++){
            for (int leftCounter = 0; leftCounter + 1 < counterPointer; leftCounter++) {
                left += arr[leftCounter];
            }

            right += IntStream.range(counterPointer, arr.length).map(rightCounter -> arr[rightCounter]).sum();

            if(right - left == 0) {
                return all;
            } else counterPointer++;
            right = 0;
            left = 0;
        }

        return -1;
    }

    public static int findEvenIndexBest(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        int sumLeft = 0;
        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i-1];
            sumRight -= arr[i];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }

    public static int findEvenIndexBestPractice(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(leftSum(arr, i) == rightSum(arr, i))
                return i;
        }

        return -1;
    }

    public static long leftSum(int[] arr,int idx){
        long result = 0;

        for(int i = 0; i < idx; i++){
            result += arr[i];
        }

        return result;
    }

    public static long rightSum(int[] arr, int idx){
        long result = 0;

        for(int i = idx + 1; i < arr.length; i++){
            result += arr[i];
        }

        return result;
    }
}

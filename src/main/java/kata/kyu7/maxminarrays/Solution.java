package kata.kyu7.maxminarrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int[] solve(int[] arr) {
        List<Integer> result = new ArrayList<>();
        List<Integer> staging = new ArrayList<Integer>(arr.length);
        for (int a : arr) staging.add(a);
        Collections.sort(staging, Collections.reverseOrder());

        int i = 0;
        while (i < staging.size()) {
            result.add(staging.get(i));
            staging.remove(i);

            if (staging.size() == 0) break;
            result.add(Collections.min(staging));
            staging.remove(Collections.min(staging));

            if (staging.size() == 0) break;

        }

        int[] finalIntArray = new int[arr.length];
        for(int t = 0; t < arr.length; t++){
            finalIntArray[t] = result.get(t);
        }

        return finalIntArray;
    }

    public static int[] solveBest (int[] arr){
        Arrays.sort(arr);
        int[] solutionArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            solutionArray[i] = i % 2 == 0 ? arr[arr.length - i/2 - 1] : arr[i/2];
        }
        return solutionArray;
    }

    public static int[] solveSimple (int[] arr){
        List<Integer> temp = new ArrayList<Integer>();
        Arrays.sort(arr);
        for (int i = 0, j = arr.length - 1; i <= j; ++i, --j) {
            if (i != j) temp.add(arr[j]);
            temp.add(arr[i]);
        }
        return temp.stream().mapToInt(i -> i).toArray();
    }
}
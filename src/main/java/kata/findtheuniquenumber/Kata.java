package kata.findtheuniquenumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static double findUniq(double arr[]) {

        Map<Double, Integer> mapNumbers = new HashMap<>();
        for(Double n: arr){
            if(mapNumbers.containsKey(n)){
                mapNumbers.put(n, mapNumbers.get(n) + 1);
            } else {
                mapNumbers.put(n, 1);
            }
        }

        return mapNumbers.entrySet().stream()
                .filter(numbers -> numbers.getValue() == 1.0)
                .findFirst().map(numbers -> numbers.getKey().doubleValue())
                .orElse(0.0);

    }

    public static double findUniqBest(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }

    public static double findUniqStream(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }

    public static double findUniqSimple(double arr[]) {
        final double x = arr[arr[0] == arr[1] ? 0 : 2];
        for (double y : arr)
            if (y != x)
                return y;
        throw new RuntimeException("no unique number found");
    }
}

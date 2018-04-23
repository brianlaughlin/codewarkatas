package kata.kyu8.howmanystairsdidsuzukiclimbin20years;

import java.util.Arrays;

public class Kata {
    public static long stairsIn20(int[][] stairs)
    {
        long result = 0;
        for(int row = 0; row < stairs.length; row++){
            for(int col = 0; col < stairs[row].length; col++){
                result += stairs[row][col];
            }
        }
        return result * 20;
    }

    public static long stairsIn20Stream(int[][] stairs)
    {
        return 20 * Arrays.stream(stairs).flatMapToInt(arr -> Arrays.stream(arr)).sum();
    }
}

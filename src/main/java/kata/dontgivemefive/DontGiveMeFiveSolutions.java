package kata.dontgivemefive;

import java.util.stream.IntStream;

public class DontGiveMeFiveSolutions {

    public static int dontGiveMeFive1(int start, int end){
        int ans = 0;
        for (int i = start; i <= end; i++) {
            if (!("" + i).contains("5")) ans++;
        }
        return ans;
    }

    public static long dontGiveMeFive2(int start, int end)
    {
        return IntStream.rangeClosed(start, end).filter(x -> !String.valueOf(x).matches(".*5.*")).count();
    }

}

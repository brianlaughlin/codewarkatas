package kata.beginnerseriessumofnumbers;

import java.util.stream.IntStream;

public class Sum {
    public int GetSum(int a, int b) {
        int num = 0;
        if (a == b) return a;
        if (a < b) {
            num += IntStream.rangeClosed(a, b).sum();
        } else {
            num += IntStream.rangeClosed(b,a).sum();
        }
            return num;
    }

    public int GetSumBetter(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }
}

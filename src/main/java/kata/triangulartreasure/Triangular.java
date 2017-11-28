package kata.triangulartreasure;

import java.util.stream.IntStream;

public class Triangular {
    public static int triangular(int n) {

        return IntStream.range(1, n + 1).sum();
    }
}

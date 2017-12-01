package kata.busmasteringwhoisthemostpriority;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class BusMastering {
    public static String arbitrate(String input, int n) {
        StringBuilder result = new StringBuilder();

        OptionalInt pos = IntStream.range(0, n)
                .filter(i -> input.charAt(i) == 49)
                .findFirst();

        if (pos == OptionalInt.empty()) return input;

        for (int i = 0; i < n; i++) {
            if (i == pos.getAsInt()) {
                result.append("1");
            } else result.append("0");
        }

        return result.toString();
    }

}

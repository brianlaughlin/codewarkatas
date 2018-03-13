package kata.kyu8.squashthebugs;

import java.util.Arrays;
import java.util.stream.Stream;

public class Kata {
    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        return Arrays.stream(spl)
                .mapToInt(String::length)
                .filter(i -> i >= 0)
                .max()
                .orElse(0);
    }

    public static int findLongestBest(final String str) {
        return Stream.of(str.split(" "))
                .mapToInt(s -> s.length())
                .max()
                .getAsInt();
    }
}
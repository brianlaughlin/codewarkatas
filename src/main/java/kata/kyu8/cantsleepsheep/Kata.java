package kata.kyu8.cantsleepsheep;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {
    public static String countingSheep(int num) {
        return IntStream.range(0, num).mapToObj(i -> (i + 1) + " sheep...").collect(Collectors.joining());
    }
}
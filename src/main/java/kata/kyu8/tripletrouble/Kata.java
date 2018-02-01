package kata.kyu8.tripletrouble;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static String tripleTrouble(String one, String two, String three) {

        return IntStream.range(0, one.length())
                .mapToObj(i -> String.valueOf(one.charAt(i))
                        + two.charAt(i) + three.charAt(i))
                .collect(Collectors.joining());
    }
}

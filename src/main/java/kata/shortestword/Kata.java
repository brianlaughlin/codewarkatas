package kata.shortestword;

import java.util.stream.Stream;

public class Kata {
    static int findShort(String s) {

        String[] words = s.split(" ");
        int shortest = 1000;
        for (String word : words) {
            if (word.length() < shortest) shortest = word.length();
        }
        return shortest;
    }

    public static int findShortSteam(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}

package kata.kyu7.spalitinparts;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InParts {
    public static String splitInParts(String s, int partLength) {
        Iterable<String> result = Splitter.fixedLength(partLength).split(s);
        String[] parts = Iterables.toArray(result, String.class);

        String combineWithSpace = Arrays.stream(parts).map(p -> p + " ").collect(Collectors.joining());
        return combineWithSpace.trim();
    }

    public static String splitInPartsBestPractice(String s, int partLength) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = partLength++; i < sb.length(); i += partLength) {
            sb.insert(i, " ");
        }
        return sb.toString();
    }
}


package kata.weightforweight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// #1
public class Working {
    public static String orderWeightBest(String string) {
        String[] split = string.split(" ");
        Arrays.sort(split, new Comparator<String>() {
            public int compare(String a, String b) {
                int aWeight = a.chars().map(c -> Character.getNumericValue(c)).sum();
                int bWeight = b.chars().map(c -> Character.getNumericValue(c)).sum();
                return aWeight - bWeight != 0 ? aWeight - bWeight : a.compareTo(b);
            }
        });
        return String.join(" ", split);
    }

    // #2
    public static String orderWeightStream(String strng) {
        return
                Arrays.stream(strng.split(" "))
                        .sorted(Comparator
                                .comparing(Working::sumDigits)
                                .thenComparing(String::compareTo))
                        .collect(Collectors.joining(" "));

    }

    private static Integer sumDigits(String s) {
        return s.chars().map(c -> c - 48).sum();
    }

    // #3
    public static String orderWeightStream2(String strng) {
        return Arrays.stream(strng.split(" ")).sorted((String n1, String n2) -> {
            int w1 = Arrays.stream(n1.split("")).mapToInt(d -> Integer.parseInt(d)).sum();
            int w2 = Arrays.stream(n2.split("")).mapToInt(d -> Integer.parseInt(d)).sum();
            if (w1 < w2) {
                return -1;
            } else if (w1 == w2) {
                return n1.compareTo(n2);
            } else {
                return 1;
            }
        }).collect(Collectors.joining(" "));
    }

    // #4
    public static String orderWeightHashMap(String strng) {
        String[] strings = strng.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            int i = 0;
            for (char c : s.toCharArray()) {
                i += c - '0';
            }
            map.put(s, i);
        }

        Arrays.sort(strings, (s1, s2) -> {
            int i = map.get(s1).compareTo(map.get(s2));
            if (i == 0) {
                i = s1.compareTo(s2);
            }
            return i;
        });

        return String.join(" ", strings);
    }

    // #5
    public static String orderWeightSimple(String s) {
        String[] parts = s.split(" ");
        Arrays.sort(parts, new Comparator<String>() {
            public int compare(String s1, String s2) {
                int n = s1.chars().map(e -> e - '0').sum() - s2.chars().map(e -> e - '0').sum();
                return n == 0 ? s1.compareTo(s2) : n;
            }
        });
        return String.join(" ", parts);
    }
}

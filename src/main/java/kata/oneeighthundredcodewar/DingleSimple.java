package kata.oneeighthundredcodewar;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DingleSimple {

    static class Preloaded {
        static String[] WORDS = {"CODE", "DAMN", "WAR", "WAS", "YAP", "ZAP", "QWE"};
    }
    

        static Set<Character> exclusions = new HashSet<>(Arrays.asList('S', 'V', 'Y', 'Z'));
        static Map<Character, Integer> charNumberMap = IntStream.rangeClosed('A', 'Z').boxed().collect(Collectors.toMap(
                x -> (char) x.intValue(),
                x -> (x - 'A') / 3 - (exclusions.contains((char) x.intValue()) ? 1 : 0)
        ));

        public static Set<String> check1800(final String str) {
            String[] info = str.split("-");
            List<Integer> numbers
                    = (info[2] + info[3]).chars().map(x -> charNumberMap.get((char) x)).boxed().collect(Collectors.toList());
            return Stream.of(Preloaded.WORDS)
                    .flatMap(s1 -> Stream.of(Preloaded.WORDS).filter(s2-> s1.length() + s2.length() == numbers.size())
                            .filter(s2 -> (s1 + s2).chars().map(x -> charNumberMap.get((char) x))
                                    .boxed().collect(Collectors.toList()).equals(numbers)
                            ).map(s2 -> "1-800-" + s1 + "-" + s2)
                    ).collect(Collectors.toSet());
        }
}

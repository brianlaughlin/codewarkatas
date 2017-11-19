package kata.stringtask;

import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class StringTask {
    public static String perform(String word) {
        Predicate<Character> isNonLowerCaseVowel = c -> !"aeiou".contains(""+c);

        String str = word
                .toLowerCase()
                .chars()
                .mapToObj(e->(char) e)
                .filter(isNonLowerCaseVowel)
                .map(String::valueOf)
                .collect(Collectors.joining("."));

        return str.isEmpty() ? str : "."+str;

    }

    static String performBetter(final String word) {
        return word.toLowerCase()
                .replaceAll("[aeiouy]", "")
                .replaceAll("([a-z])", ".$1");
    }
}

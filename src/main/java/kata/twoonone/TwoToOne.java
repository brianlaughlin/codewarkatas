package kata.twoonone;

import java.util.*;

public class TwoToOne {
    public static String longest(String s1, String s2) {

        String newString = s1 + s2;
        ArrayList<String> sorted = new ArrayList<>(Arrays.asList(newString.split("")));

        Collections.sort(sorted);
        Set<String> unique = new TreeSet<>();

        unique.addAll(sorted);

        StringBuilder finalString = new StringBuilder();
        for(String ltr: unique){
            finalString.append(ltr);
        }

        return finalString.toString();
    }

    public static String longestStream (String s1, String s2) {
        String s = s1 + s2;
        return s.chars()
                .distinct()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static String longestStream2 (String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        (s1 + s2).chars()
                .distinct()
                .sorted()
                .forEach(c -> sb.append((char) c));
        return sb.toString();
    }
}

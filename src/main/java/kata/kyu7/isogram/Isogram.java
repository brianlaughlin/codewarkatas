package kata.kyu7.isogram;

import java.util.HashMap;
import java.util.Map;

public class Isogram {
    public static boolean isIsogram(String str) {
        Map<Character, Integer> isoCount = new HashMap<>();

        for (Character c : str.toUpperCase().toCharArray()) {
            if (isoCount.containsKey(c)) return false;
            else {
                isoCount.put(c, 1);
            }
        }
        return true;
    }

    public static boolean  isIsogramLessCode(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

    public static boolean isIsogramAnotherWay(String str) {
        return str.toLowerCase()
                .chars()
                .distinct()
                .count() == str.length();
    }
}

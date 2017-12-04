package kata.consecutivestrings;

import org.apache.commons.collections.list.SetUniqueList;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;


// Coding Challenge: https://www.codewars.com/kata/consecutive-strings/train/java

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder result = new StringBuilder();
            int bound = index + k;
            for (int i = index; i < bound; i++) {
                String s = strarr[i];
                result.append(s);
            }
            String sb = result.toString();
            if (sb.length() > longestStr.length()) longestStr = sb;
        }
        return longestStr;
    }

    public static String longestConsecStream(String[] strArr, int k) {
        return (k > 0 && strArr.length > 0 && k <= strArr.length) ?
                IntStream.rangeClosed(0, strArr.length - k)
                        .mapToObj(i -> IntStream.range(0, k).mapToObj(j -> strArr[i + j]).collect(Collectors.joining()))
                        .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                        .findFirst().get()
                : "";
    }

    public static String longestConsecStream2(String[] strarr, int k) {
        String maxStr = "";
        for (int i=0; i<=strarr.length-k; i++) {
            String current = IntStream.range(i, i+k).mapToObj(j -> strarr[j]).collect(Collectors.joining());
            if (current.length() > maxStr.length()) maxStr = current;
        }
        return maxStr;
    }


    public static String longestConsec2(String[] strarr, int k) {

        // Check null states
        if((strarr.length == 0) || (k > strarr.length) || (k <= 0)) return "";

        // store in copy
        String[] sortedArray = Arrays.copyOf(strarr, strarr.length);

        // Sorts String Array
        Arrays.sort(sortedArray, Comparator.comparingInt(String::length).reversed());

        // Remove Duplicates
        List<String> uniqueWords = SetUniqueList.decorate(new ArrayList(Arrays.asList(sortedArray)));

        // Build new String
        StringBuilder longString = new StringBuilder();
        for(int i =0 ; i < k; i++){
            longString.append(uniqueWords.get(i));
        }

        return longString.toString();
    }
}

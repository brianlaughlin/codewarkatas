package kata.consecutivestrings;

import org.apache.commons.collections.list.SetUniqueList;

import java.util.*;


// Coding Challenge: https://www.codewars.com/kata/consecutive-strings/train/java

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
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

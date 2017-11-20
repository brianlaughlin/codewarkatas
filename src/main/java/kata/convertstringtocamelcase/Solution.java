package kata.convertstringtocamelcase;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
    static String toCamelCase(String s){

        String[] words = s.split("-|_");
        StringBuilder result = new StringBuilder();

        int counter = 0;
        for(String word: words){
            if (counter > 0) {
                String firstLetter = word.substring(0,1).toUpperCase();
                result.append(firstLetter).append(word.substring(1));
                counter++;
            } else {
                result.append(word);
                counter++;
            }
        }

        return result.toString();
    }


    static String toCamelCaseBest(String s){
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }

    static String toCamelCaseStream1(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
    

    static String toCamelCaseStream2(String s){
        if(s.length() < 1) return "";
        String rt =  Arrays.stream(s.split("-|_"))
                .map(v -> v.substring(0,1).toUpperCase() + v.substring(1))
                .collect(Collectors.joining(""));
        return s.substring(0,1) + rt.substring(1);
    }
}

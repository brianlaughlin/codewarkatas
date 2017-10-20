package kata.highestscoringword;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {
    public static String high(String s) {

        int highestWordCount = 0;
        String[] word = s.split(" ");
        String highestWord = "";
        for(String w: word){
            if(highestWordCount < getWordCount(w)){
                highestWordCount = getWordCount(w);
                highestWord = w;

            }
        }
        return highestWord;
    }

    private static int getWordCount(String w) {
        int count = 0;
        for(int i = 0; i < w.length(); i++){
            count += w.charAt(i) - 96;
        }
        return count;
    }


    public static String highBetter(String s) {
        return Arrays.stream(s.split(" "))
                .sorted(Comparator.comparingInt(Kata::calculateWordScore).reversed())
                .findFirst().get();
    }

    private static int calculateWordScore(String word) {
        return word.chars().map(c -> c - (int)'a' + 1).sum();
    }
}

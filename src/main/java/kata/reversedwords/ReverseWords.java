package kata.reversedwords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static String reverseWords(String str) {

        String[] forward = str.split(" ");
        String[] backward = new String[forward.length];

        int t = 0;
        for (int i = forward.length; i > 0; i--) {
            backward[t] = forward[i - 1];
            t++;
        }
        String result = String.join(" ", backward);

        return result;
    }

    public static String reverseWordsBetter(String str){
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }
}
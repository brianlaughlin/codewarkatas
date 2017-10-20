package kata.reversedstrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static String solution(String str) {

        char[] forward = str.toCharArray();
        char[] reverse = new char[forward.length];
        int t = 0;
        for(int i = str.length(); i > 0; i--){
            reverse[t] = forward[i - 1];
            t++;
        }

        return String.valueOf(reverse);
    }

    public static String solutionBetter(String str){
        return new StringBuilder(str).reverse().toString();

    }

}

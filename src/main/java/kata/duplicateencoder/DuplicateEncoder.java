package kata.duplicateencoder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
    static String encode(String word){

        Map<String, Integer> charCount = new HashMap<>();
        String[] words = word.toUpperCase().split("");

        for(String aWord: words){
            if(charCount.containsKey(aWord)){
                charCount.put(aWord, charCount.get(aWord) + 1);
            } else charCount.put(aWord, 1);
        }

        StringBuilder result = new StringBuilder();
        for(String aWord: words){
            if(charCount.get(aWord) <= 1){
                result.append("(");
            } else result.append(")");
        }

        return result.toString().trim();
    }
}

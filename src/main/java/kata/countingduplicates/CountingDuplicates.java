package kata.countingduplicates;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        Map<Character, Integer> eachChar = new HashMap<>();

        for (Character ch : text.toUpperCase().toCharArray()) {
            if (eachChar.containsKey(ch)) {
                eachChar.put(ch, eachChar.get(ch) + 1);
            } else {
                eachChar.put(ch, 1);
            }
        }

        int count = 0;
        Collection<Integer> valueCount = eachChar.values();
        for(Integer val: valueCount){
            if(val > 1) count++;
        }

        return count;
    }
}

package kata.findcountmostelementinarray;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        int most = 0;
        for (int i = 0; i < collection.length; i++) {
            int count = 0;
            for (int x : collection) {
                if (x == collection[i]) count++;
            }
            if (count > most) {
                most = count;
            }
        }
        return most;
    }


    public static int mostFrequentItemCountBetter(int[] collection) {
        if (collection.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : collection)
            map.put(number, map.containsKey(number) ? map.get(number)+1 : 1);
        return map.values().stream().max(Integer::compareTo).get();
    }
}


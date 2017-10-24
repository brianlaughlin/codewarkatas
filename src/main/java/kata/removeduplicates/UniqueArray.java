package kata.removeduplicates;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class UniqueArray {
    public static int[] unique(int[] integers) {
        LinkedHashSet<Integer> hset = new LinkedHashSet<Integer>();


        if(integers.length == 0) return integers;
        for(int i = 0; i < integers.length; i++){
            hset.add(integers[i]);
        }

        int[] newIntegers = new int[hset.size()];
        Iterator<Integer> it = hset.iterator();
        int i = 0;
        while(it.hasNext()){
            newIntegers[i] = it.next();
            i++;
        }
        return newIntegers;
    }

    public static int[] uniqueBetter(int[] integers) {
        return Arrays.stream(integers).distinct().toArray();
    }
}

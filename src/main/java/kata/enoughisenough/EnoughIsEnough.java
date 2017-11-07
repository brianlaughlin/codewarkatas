package kata.enoughisenough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOcurrences) {

        int newSize = 0;
        int count = 0;
        if (elements.length == 0) return elements;
        processArray(elements, maxOcurrences, count);

        newSize = getArraySize(elements);
        int[] newElements = createNewArray(elements, newSize);

        System.out.println(Arrays.toString(newElements));
        return newElements;
    }

    private static void processArray(int[] elements, int maxOcurrences, int count) {
        for (int i = 0; i < elements.length; i++) {
            for (int t = 0; t < elements.length; t++) {
                if (elements[t] == elements[i]) {
                    count++;
                    if (count > maxOcurrences) {
                        elements[t] = 0;
                        count = 0;
                        break;
                    }
                }
            }
            count = 0;
        }
    }

    private static int[] createNewArray(int[] elements, int newSize) {
        int count;
        int[] newElements = new int[newSize];
        count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != 0) {
                newElements[count] = elements[i];
                count++;
            }
        }
        return newElements;
    }

    private static int getArraySize(int[] elements) {
        int result = 0;
        for(int i: elements){
            if(i != 0){
                result++;
            }
        }
        return result;
    }

    public static int[] deleteNthBetter(int[] elements, int max) {

        if (max < 1) return new int[0];

        final HashMap<Integer,Integer> map = new HashMap<>();
        final List<Integer> list = new ArrayList<>();

        for (final Integer i : elements) {
            final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
            if (v == null || v < max) list.add(i);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}

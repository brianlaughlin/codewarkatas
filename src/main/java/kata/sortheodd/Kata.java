package kata.sortheodd;

import java.util.*;
import java.util.stream.IntStream;

public class Kata {
    public static int[] sortArray(int[] array) {

        List<Integer> evenSorted = new ArrayList<Integer>();
        for(Integer arrayInt: array){
            if(arrayInt % 2 == 1) evenSorted.add(arrayInt);
        }

        Collections.sort(evenSorted);

        int evenListPos = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                  array[i] = evenSorted.get(evenListPos);
                  evenListPos++;
            }
        }
        return array;
    }

    public static int[] sortArrayBest(final int[] array) {

        // Sort the odd numbers only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        // Then merge them back into original array
        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;
    }

    public static int[] sortArrayStream(int[] array) {
        PrimitiveIterator.OfInt sortedOdds = IntStream
                .of(array)
                .filter(i -> i % 2 == 1)
                .sorted()
                .iterator();

        return IntStream
                .of(array)
                .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
                .toArray();
    }


    // Clean Stream Kata
    public static boolean isOdd(final int n) {
        return n % 2 != 0;
    }

    public static int[] sortArrayCleanStream(final int[] array) {
        final Iterator<Integer> sortedOdds = IntStream.of(array)
                .filter(Kata::isOdd)
                .sorted()
                .iterator();
        return IntStream.of(array)
                .map(n -> isOdd(n) ? sortedOdds.next() : n)
                .toArray();
    }

}

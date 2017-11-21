package kata.playground;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
using this as a playground and testing syntax
 */
public class TestingStuff {


//    public static String areYouPlayingBanjo(String name) {
//        if (String.valueOf(name.charAt(0)).toUpperCase().equals("R")) {
//            return name + " " + "plays banjo"
//        } else return name + " " + "does not plays banjo";
//    }

    public int GetSum(int a, int b) {
        if (a == b) return a;
        if (a < b) {
            return Stream.iterate(a, e -> e + 1)
                    .mapToInt(e -> e)
                    .limit(b)
                    .sum();
        } else {
            return Stream.iterate(b, e -> e + 1)
                    .mapToInt(e -> e)
                    .limit(a)
                    .sum();
        }

    }

    static int find(int[] integers){

        int evenCount = 0;
        evenCount = (int) IntStream.of(integers)
                .filter(e->e % 2 == 0)
                .count();

        if (evenCount == 1) {
            return IntStream.of(integers)
                    .filter(e-> e % 2 ==0)
                    .min()
                    .getAsInt();
        } else {
            return IntStream.of(integers)
                    .filter(e-> e % 2 ==1)
                    .min()
                    .getAsInt();
        }
    }

    static int words(String s){

        String[] words = s.split(" ");
        int shortest = 1000;
        for(String word: words){
            if(word.length() < shortest) shortest = word.length();
        }


        return shortest;
    }

}

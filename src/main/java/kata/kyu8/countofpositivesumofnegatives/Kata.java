package kata.kyu8.countofpositivesumofnegatives;

import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(input == null || input.length == 0 ) return new int[] {};

        int pos = 0;
        int neg = 0;
        for(int i =0; i < input.length; i++){
            if(input[i] > 0) pos++;
            else neg += input[i];
        }
        return new int[]{pos, neg}; //return an array with count of positives and sum of negatives
    }


    public static int[] countPositivesSumNegativesStream(int[] input)
    {

        if(input.length == 0) return new int[] {};

        int pos = 0;
        int neg = 0;

        pos = (int) stream(input)
                .filter(e->e > 0).count();
        neg = (int) stream(input)
                .filter(e->e < 0).sum();

        return new int[]{pos, neg}; //return an array with count of positives and sum of negatives
    }

    public static int[] countPositivesSumNegativesStream2(int[] input) {
        return input == null || input.length == 0 ?
                new int[0] :
                new int[] { (int) IntStream.of(input).filter(i->i>0).count(), IntStream.of(input).filter(i->i<0).sum() };
    }
}

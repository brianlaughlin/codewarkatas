package kata.calculateaverage;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class Kata {
    public static double find_average(int[] array){

        return stream(array)
                .average().getAsDouble();

    }

    public static double find_average2(int[] array){
        return stream(array).average().orElse(0);
    }

    public static double find_average3(int[] array){
        return stream(array).average().getAsDouble();
    }

    public static double find_average4(int[] array){
        return IntStream.of(array).average().getAsDouble();
    }
}

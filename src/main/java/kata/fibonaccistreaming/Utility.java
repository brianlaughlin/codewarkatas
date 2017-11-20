package kata.fibonaccistreaming;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.math.BigInteger.*;

public class Utility {

    public static IntStream generateFibonacciSequence() {

        return Stream.iterate(new int[]{1, 1},
                array -> new int[]{array[1], array[0] + array[1]})
                .mapToInt(array -> array[0]);


    }

    public static IntStream generateFibonacciSequenceWorking() {
        return Stream.iterate(new int[]{1, 1},
                array -> new int[]{array[1], array[0] + array[1]})
                .mapToInt(array -> array[0]);
    }

    public static void infinateStream(){
        Stream.iterate(new BigInteger[]{ BigInteger.ONE, BigInteger.ONE },
                p->new BigInteger[]{ p[1], p[0].add(p[1]) })
                .forEach(p->System.out.println(p[0]));
    }

}
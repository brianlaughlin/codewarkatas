package kata.kyu8.larioandmuigipipeproblem;

import java.util.stream.IntStream;

public class Kata {
    public static int[] pipeFix(int[] numbers) {

        int first, last, range;

        first = numbers[0];
        last = numbers[numbers.length -1];

        range = last - first + 1;

        int[] result = new int[range];

        result[0] = numbers[0];
        int incrementBy = result[0];
        for(int i = 1; i < result.length; i++){
            incrementBy++;
            result[i] = incrementBy;
        }

        return result;
    }

    public static int[] pipeFixStream(int[] numbers) {

        return IntStream
                .rangeClosed(numbers[0], numbers[numbers.length -1])
                .toArray();

    }
}

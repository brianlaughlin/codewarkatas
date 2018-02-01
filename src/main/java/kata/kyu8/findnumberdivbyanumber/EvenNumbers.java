package kata.kyu8.findnumberdivbyanumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenNumbers {

    public static int[] divisibleBy(int[] numbers, long divider) {

        List<Integer> newNumbers = IntStream.range(0, numbers.length)
                .filter(i -> numbers[i] % divider == 0)
                .mapToObj(i -> numbers[i])
                .collect(Collectors.toList());

        return newNumbers.stream()
                .mapToInt(newNumber -> newNumber)
                .toArray();

    }


    public static int[] divisibleByBest(int[] numbers, int divider) {

        return Arrays.stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();
    }

}

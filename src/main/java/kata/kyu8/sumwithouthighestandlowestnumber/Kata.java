package kata.kyu8.sumwithouthighestandlowestnumber;

import java.util.Arrays;
import java.util.stream.Stream;
import static java.util.stream.IntStream.of;

public class Kata {
    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length < 2) return 0;

        int sum = Arrays.stream(numbers, 0, numbers.length).sum();

        sum = sum - Arrays.stream(numbers).min().getAsInt()
                  - Arrays.stream(numbers).max().getAsInt();

        return sum;
    }

}



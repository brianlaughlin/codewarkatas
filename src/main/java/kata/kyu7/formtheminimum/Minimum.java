package kata.kyu7.formtheminimum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Minimum {
    public static int minValue(int[] values) {

        List<Integer> sortedList = Arrays.stream(values)
                .boxed()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        return Integer.parseInt(sortedList.stream()
                .map(Object::toString)
                .collect(Collectors.joining()));

    }

    public static int minValueStream2(int[] values){
        String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
    }
}

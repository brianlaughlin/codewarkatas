package kata.decendingorder;

import java.util.*;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        char[] c = (""+num).toCharArray();

        List<Integer> col = new ArrayList<>();
        for(char eachC: c){
            String n = String.valueOf(eachC);
            col.add(Integer.valueOf(n));
        }
        Collections.sort(col, Collections.reverseOrder());

        String result = "";
        for(Integer i: col){
            result += i.toString();
        }
        return Integer.parseInt(result);
    }


    public static int sortDescStream(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

    public static int sortDescClean(final int num) {
        String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
        Arrays.sort(numbers);

        String result = "";

        for(String s : numbers)
        {
            result = s + result;
        }

        return Integer.parseInt(result);
    }

    public static int sortDescILike(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

    public static int sortDescNiceStream(final int num) {
        if (num < 0) throw new IllegalArgumentException("Negative number: " + num);

        return Integer.parseInt(Integer.toString(num).codePoints()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .reverse()
                .toString());
    }
}
package kata.kyu8.filteringevennumbers;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbersOrg)
    {
        List<Integer> listOfNumbers = new LinkedList<>();
        for (int i = 0; i < listOfNumbersOrg.size(); i++)
            if (isOdd(listOfNumbersOrg, i)) {
                listOfNumbers.add(listOfNumbersOrg.get(i));
            }

        return listOfNumbers;
    }

    private static boolean isOdd(List<Integer> listOfNumbersOrg, int i) {
        if (listOfNumbersOrg.get(i) == 0) return false;

        return Math.abs(listOfNumbersOrg.get(i)) % 2 == 1;
    }

    public static List<Integer> filterOddNumberStream(List<Integer> listOfNumbers)
    {

        return listOfNumbers.stream().filter(l -> l%2 != 0).collect(Collectors.toList());
    }
}
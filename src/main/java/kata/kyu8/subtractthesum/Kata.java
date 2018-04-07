package kata.kyu8.subtractthesum;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Kata {

    public static String subtractSumBest(int n) {
        return "apple";
    }

    public static String subtractSum(int n) {
        int num = n;
        Map<Integer, String> lookupFood = new HashMap<>();
        loadMap(lookupFood);

        char[] digits = setDigits(num);

        num = getSumOfDigits(num, digits);
        digits = setDigits(num);
        while (lookupFood.get(num) == null) {

            num = getSumOfDigits(num, digits);
            digits = setDigits(num);
        }
        return lookupFood.get(num);
    }

    private static char[] setDigits(int num) {
        char[] digits;
        digits = ("" + num).toCharArray();
        return digits;
    }

    private static int getSumOfDigits(int n, char[] digits) {
        int sumOfDigits = IntStream
                .range(0, digits.length)
                .map(i -> Character.getNumericValue(digits[i]))
                .sum();

        n -= sumOfDigits;
        return n;
    }

    private static void loadMap(Map<Integer, String> lookupFood) {
        lookupFood.put(1, "kiwi");
        lookupFood.put(2, "pear");
        lookupFood.put(3, "kiwi");
        lookupFood.put(4, "banana");
        lookupFood.put(5, "melon");
        lookupFood.put(6, "banana");
        lookupFood.put(7, "melon");
        lookupFood.put(8, "pineapple");
        lookupFood.put(9, "apple");
        lookupFood.put(10, "pineapple");
        lookupFood.put(11, "cucumber");
        lookupFood.put(12, "pineapple");
        lookupFood.put(13, "cucumber");
        lookupFood.put(14, "orange");
        lookupFood.put(15, "grape");
        lookupFood.put(16, "orange");
        lookupFood.put(17, "grape");
        lookupFood.put(18, "apple");
        lookupFood.put(19, "grape");
        lookupFood.put(20, "cherry");
        lookupFood.put(21, "pear");
        lookupFood.put(22, "cherry");
        lookupFood.put(23, "pear");
        lookupFood.put(24, "kiwi");
        lookupFood.put(25, "banana");
        lookupFood.put(26, "kiwi");
        lookupFood.put(27, "apple");
        lookupFood.put(28, "melon");
        lookupFood.put(29, "banana");
        lookupFood.put(30, "melon");
        lookupFood.put(31, "pineapple");
        lookupFood.put(32, "melon");
        lookupFood.put(33, "pineapple");
        lookupFood.put(34, "cucumber");
        lookupFood.put(35, "orange");
        lookupFood.put(36, "apple");
        lookupFood.put(37, "orange");
        lookupFood.put(38, "grape");
        lookupFood.put(39, "orange");
        lookupFood.put(40, "grape");
        lookupFood.put(41, "cherry");
        lookupFood.put(42, "pear");
        lookupFood.put(43, "cherry");
        lookupFood.put(44, "pear");
        lookupFood.put(45, "apple");
        lookupFood.put(46, "pear");
        lookupFood.put(47, "kiwi");
        lookupFood.put(48, "banana");
        lookupFood.put(49, "kiwi");
        lookupFood.put(50, "banana");
        lookupFood.put(51, "melon");
        lookupFood.put(52, "pineapple");
        lookupFood.put(53, "melon");
        lookupFood.put(54, "apple");
        lookupFood.put(55, "cucumber");
        lookupFood.put(56, "pineapple");
        lookupFood.put(57, "cucumber");
        lookupFood.put(58, "orange");
        lookupFood.put(59, "cucumber");
        lookupFood.put(60, "orange");
        lookupFood.put(61, "grape");
        lookupFood.put(62, "cherry");
        lookupFood.put(63, "apple");
        lookupFood.put(64, "cherry");
        lookupFood.put(65, "pear");
        lookupFood.put(66, "cherry");
        lookupFood.put(67, "pear");
        lookupFood.put(68, "kiwi");
        lookupFood.put(69, "pear");
        lookupFood.put(70, "kiwi");
        lookupFood.put(71, "banana");
        lookupFood.put(72, "apple");
        lookupFood.put(73, "banana");
        lookupFood.put(74, "melon");
        lookupFood.put(75, "pineapple");
        lookupFood.put(76, "melon");
        lookupFood.put(77, "pineapple");
        lookupFood.put(78, "cucumber");
        lookupFood.put(79, "pineapple");
        lookupFood.put(80, "cucumber");
        lookupFood.put(81, "apple");
        lookupFood.put(82, "grape");
        lookupFood.put(83, "orange");
        lookupFood.put(84, "grape");
        lookupFood.put(85, "cherry");
        lookupFood.put(86, "grape");
        lookupFood.put(87, "cherry");
        lookupFood.put(88, "pear");
        lookupFood.put(89, "cherry");
        lookupFood.put(90, "apple");
        lookupFood.put(91, "kiwi");
        lookupFood.put(92, "banana");
        lookupFood.put(93, "kiwi");
        lookupFood.put(94, "banana");
        lookupFood.put(95, "melon");
        lookupFood.put(96, "banana");
        lookupFood.put(97, "melon");
        lookupFood.put(98, "pineapple");
        lookupFood.put(99, "apple");
        lookupFood.put(100, "pineapple");


    }
}

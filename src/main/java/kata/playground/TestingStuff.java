package kata.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
using this as a playground and testing syntax
 */
public class TestingStuff {


    public static List<String> sort(List<String> textbooks) {

        textbooks.sort(String::compareToIgnoreCase);
        return textbooks;

    }

    static int find(int[] integers) {

        int evenCount = 0;
        evenCount = (int) IntStream.of(integers)
                .filter(e -> e % 2 == 0)
                .count();

        if (evenCount == 1) {
            return IntStream.of(integers)
                    .filter(e -> e % 2 == 0)
                    .min()
                    .getAsInt();
        } else {
            return IntStream.of(integers)
                    .filter(e -> e % 2 == 1)
                    .min()
                    .getAsInt();
        }
    }

    public static String bmi(double weight, double height) {
        double bmiValue = weight / Math.pow(height, 2);

        if (bmiValue <= 18.5) return "Underweight";
        if (bmiValue <= 25.0) return "Normal";
        if (bmiValue <= 30.0) return "Overweight";
        return "Obese";
    }

    static String printerError(String s) {

        s = s.toLowerCase();
        String bad = "[nopqrstuvwxyz]";
        int orgLength = s.length();
        int hasBad = 0;
        int hasGood = 0;

        hasGood = s.toLowerCase()
                .replaceAll(bad, "")
                .length();

        hasBad = orgLength - hasGood;
        String result = hasBad + "/" + orgLength;

        return result;
    }


    public static int[] invert(int[] array) {

        IntStream.range(0, array.length).forEachOrdered(i -> array[i] = array[i] * -1);

        return array;
    }


    public static Integer basicMath(String op, int v1, int v2) {
        Integer result = 0;
        switch (op) {
            case "+":
                result = v1 + v2;
                break;
            case "-":
                result = v1 - v2;
                break;
            case "*":
                result = v1 * v2;
                break;
            case "/":
                result = v1 / v2;
                break;
        }

        return result;
    }

    public int min(int[] list) {
        return IntStream.of(list).min().getAsInt();

    }

    public int max(int[] list) {
        return  IntStream.of(list).max().getAsInt();
    }

    public void deleteThis(){
        List<Integer> list = new ArrayList<>();
        // Old school
        for (Integer i : list)
            for (int j = 0; j < i; j++)
                System.out.println(i * j);
    }

}

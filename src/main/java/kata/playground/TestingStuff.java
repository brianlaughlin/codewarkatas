package kata.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
using this as a playground and testing syntax
 */
public class TestingStuff {

    public static ArrayList<Integer> getInput(){

        ArrayList<Integer> ofNumbers = IntStream.range(0, 10)
                .boxed()
                .collect(Collectors
                .toCollection(ArrayList::new));

        return ofNumbers;
    }

    public static String repeatString(final Object toRepeat, final int n) {

        if(toRepeat instanceof String){

            String result = "";
            for(int i = 0; i < n; i++){
                result += toRepeat;

            }
            return result;
        }
            return "Not a string";
    }


    public String dnaToRna(String dna) {
        String rna = dna.replace("T", "U");

        return rna;
    }

    public static String bmi(double weight, double height) {
        double bmiValue = weight / Math.pow(height, 2);

        if (bmiValue <= 18.5) return "Underweight";
        if (bmiValue <= 25.0) return "Normal";
        if (bmiValue <= 30.0) return "Overweight";
        return "Obese";
    }

    public static boolean isPlural(float f) {
        return (f >= 2.0) ? true : (f < 0) ? true : false;
    }

    public static String[] kataExampleTwist() {
        ArrayList<String> sites = new ArrayList<>();
        Stream.generate(() -> sites.add("codewards")).limit(1000);

        String[] websites = sites.stream().toArray(String[]::new);
        return websites;
    }


    public String oddOrEven(){

        int[] array = new int[] {2, 5, 34, 6};

//        if(array.length == 0) return
        int sum = 0;
        sum = IntStream.rangeClosed(0, array.length)
                .sum();

        sum = 0;
        sum = Arrays.stream(array).sum();

        if(sum % 2 == 0) return "even";
        else return "odd";

    }

}

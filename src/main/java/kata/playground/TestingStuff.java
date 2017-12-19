package kata.playground;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
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


    public static int cockroachSpeed(double x) {
        if (x == 0.0) return 0;
        double result =  x * 100000 / 3600;

        return (int) result;
    }

}

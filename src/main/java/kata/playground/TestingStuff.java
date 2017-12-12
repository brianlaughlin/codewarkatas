package kata.playground;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/*
using this as a playground and testing syntax
 */
public class TestingStuff {

    public static void webBrowser() throws URISyntaxException, IOException {

        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI("http://www.google.com"));
        }

    }

    public String dnaToRna(String dna){
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

    public static boolean isPlural(float f){
        return (f >= 2.0) ? true : (f < 0) ? true : false;
    }

    public static String[] kataExampleTwist()
    {
        ArrayList<String> sites = new ArrayList<>();
        Stream.generate(() -> sites.add("codewards")).limit(1000);

        String[] websites = sites.stream().toArray(String[]::new);
        return websites;
    }

    public static void sortingStringArray(){

        String[] array1 = new String[]{"77","321", "555", "3", "-77", "1","2"};
        int[] arrayInt1 = new int[]{77, 321, 555, 3, -77, 1, 2};

        System.out.println("Orginal Array " + Arrays.toString(array1));

        Arrays.sort(arrayInt1);
        System.out.println("Int Array sorted " + Arrays.toString(arrayInt1));

    }



}
/*

        Arrays.sort(split, new Comparator<String>() {
            public int compare(String a, String b) {
                int aWeight = a.chars().map(c -> Character.getNumericValue(c)).sum();
                int bWeight = b.chars().map(c -> Character.getNumericValue(c)).sum();
                return aWeight - bWeight != 0 ? aWeight - bWeight : a.compareTo(b);
            }

 */
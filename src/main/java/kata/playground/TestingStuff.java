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



    public static String caffeineBuzz(int n){

        StringBuilder result = new StringBuilder();
        if(n % 3 == 0 && n % 4 == 0) result.append("Coffee");
        else if(n % 3 == 0 ) result.append("Java");
        else if(n % 2 == 0) result.append("Script").append("mocha_missing!");

        return result.toString();

    }

}

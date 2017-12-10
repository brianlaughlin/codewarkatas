package kata.playground;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

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

    public int max(int[] list) {
        return IntStream.of(list).max().getAsInt();
    }

    public void deleteThis() {
        List<Integer> list = new ArrayList<>();
        // Old school
        for (Integer i : list)
            for (int j = 0; j < i; j++)
                System.out.println(i * j);
    }

}

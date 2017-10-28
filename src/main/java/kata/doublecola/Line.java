package kata.doublecola;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
My code was too slow.  Check out other solutions.
 */
public class Line {

    private static List<String> theLine;

    public static String WhoIsNext(String[] names, int n) {
        theLine = new ArrayList<>(Arrays.asList(names));

        while (n > 0) {
            if (n == 1) return printResult();
            drinkCan(n);
            n--;
        }
        return null;
    }

    public static String WhoIsNextBest(String[] names, int n){
        while ( n > names.length){
            n = (n - (names.length - 1)) / 2;
        }
        return names[n-1];
    }

    public static String WhoIsNextBest2(String[] names, int n)
    {
        while(n>5) {
            n=(n-4)/2;
        }
        return names[n-1];
    }

    private static void drinkCan(int n) {
        n--;
        String currentDrinker = theLine.get(0);
        doubleDrinker(currentDrinker);

        theLine.remove(0);

    }

    private static void doubleDrinker(String currentDrinker) {
        theLine.add(currentDrinker);
        theLine.add(currentDrinker);
    }

    private static String printResult() {
        return theLine.get(0);
    }
}


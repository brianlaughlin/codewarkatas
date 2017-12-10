package kata.kyu8.kataexampletwist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KataExampleTwist {
    public static String[] kataExampleTwist()
    {
        ArrayList<String> sites = IntStream.range(0, 1000)
                .mapToObj(i -> "codewars")
                .collect(Collectors.toCollection(ArrayList::new));

        String[] websites = sites.stream().toArray(String[]::new);
        return websites;
    }

    public static String[] kataExampleTwistBest()
    {
        String[] websites = new String[1000];
        Arrays.fill(websites,"codewars");
        return websites;
    }

    public static String[] kataExampleTwistStream2()
    {
        return IntStream.range(0, 1000)
                .mapToObj(i -> "codewars")
                .toArray(size -> new String[size]);
    }
}

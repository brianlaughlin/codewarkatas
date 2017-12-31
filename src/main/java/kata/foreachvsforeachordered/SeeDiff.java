package kata.foreachvsforeachordered;

import java.util.ArrayList;
import java.util.List;

public class SeeDiff {

    public static void forEachVs() {

        List<String> forEachResult = new ArrayList<>();

        System.out.println("Using forEach()");
        String str = "Java coding is the Best!!!";
        str.chars().forEach(n -> System.out.print((char) n));


        System.out.println("\n\nUsing parallel() + forEach() run multiple times");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ") ");
            str.chars()
                    .parallel()
                    .forEach(n -> System.out.print((char) n));
            System.out.println("\\n");
        }

        System.out.println("\n\nUsing parallel() + forEachOrdered()");
        str.chars()
                .parallel()
                .forEachOrdered(SeeDiff::accept2);

    }

    private static void accept(int n) {
        System.out.print((char) n);
    }

    private static void accept2(int n) {
        System.out.print((char) n);
    }
}

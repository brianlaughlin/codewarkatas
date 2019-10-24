package kata.kyu8.wellofideaseasy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata {
    public static String well(String[] x) {
        String result;
        int counter = (int) IntStream.range(0, x.length).filter(i -> x[i].equals("good")).count();
        if (counter > 0 && counter < 3) result = "Publish!";
        else if (counter > 2) result = "I smell a series!";
        else result = "Fail!";

        return result;
    }

    public static String wellInteresting(String[] x) {
        int count = (int ) Arrays.stream(x).filter(word -> word.equals("good")).count();
        return (count == 2 || count == 1) ? "Publish!" : (count > 2) ? "I smell a series!" : "Fail!";
    }
}

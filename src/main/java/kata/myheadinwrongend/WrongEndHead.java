package kata.myheadinwrongend;

import java.util.Arrays;
import java.util.Collections;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {

        String head, bottom;
        head = arr[2];
        bottom = arr[0];
        arr[0] = head;
        arr[2] = bottom;

        return arr;
    }

    public static String[] fixTheMeerkatILikeThisOne(String[] arr) {
        String[] copy = arr.clone();
        Collections.reverse(Arrays.asList(copy));
        return copy;
    }
}

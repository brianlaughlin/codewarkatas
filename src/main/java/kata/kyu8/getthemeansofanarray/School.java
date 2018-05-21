package kata.kyu8.getthemeansofanarray;

import java.util.Arrays;

public class School {
    public static int getAverage(int[] marks){

        int sum = Arrays.stream(marks).sum();
        return sum / marks.length;
    }

}

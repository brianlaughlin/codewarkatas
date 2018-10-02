package kata.kyu8.beginnerreducebutgrow;

import java.util.Arrays;

public class Kata {
    public static int grow(int[] x){



        return Arrays.stream(x).
                reduce(1,(a,b) -> a*b);

    }

}
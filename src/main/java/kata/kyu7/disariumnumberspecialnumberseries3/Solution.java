package kata.kyu7.disariumnumberspecialnumberseries3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String disariumNumber(int number)
    {
        List<Integer> result = new ArrayList<>();
        String numberAsSring = Integer.toString(number);

        int powerOf;
        for(int i = 0 ; i < numberAsSring.length(); i++){
            powerOf = Integer.parseInt(String.valueOf(numberAsSring.charAt(i)));
            result.add((int) Math.pow( powerOf,  i + 1));
        }

        return (result.stream()
                .mapToInt(integer -> integer)
                .sum() == number) ? "Disarium !!" : "Not !!";

    }
}
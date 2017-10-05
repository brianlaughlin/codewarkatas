package kata.onesandzeros;

import java.util.List;

public class BinaryArrayToNumberBest {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}

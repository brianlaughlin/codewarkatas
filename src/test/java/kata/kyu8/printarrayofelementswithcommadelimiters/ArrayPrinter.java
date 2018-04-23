package kata.kyu8.printarrayofelementswithcommadelimiters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayPrinter {

    public static String printArray(Object array[]) {

        String result = "";
        for (int i = 0; i < array.length; i++) {

            if (i != array.length - 1) result += array[i] + ",";
            else result += array[i];
        }
        return result;
    }

    public static String printArrayStream(Object[] array) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
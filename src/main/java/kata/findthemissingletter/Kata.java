package kata.findthemissingletter;

import java.util.stream.IntStream;

public class Kata {
    public static char findMissingLetter(char[] array) {

        char charInQueue = array[0];
        for (char anArray : array) {
            if (charInQueue != anArray) {
                return charInQueue;
            } else charInQueue++;
        }
        return 0;
    }

    public static char findMissingLetterStream(char[] array)
    {
        int index = IntStream.range(0, array.length-1).filter(i -> array[i] != array[i+1]-1).findFirst().getAsInt();
        return (char)(array[index] + 1);
    }
}

package kata.findthemissingletter;

public class Kata {
    public static char findMissingLetter(char[] array) {
        char missingValue = 0;
        char charInQueue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (charInQueue != array[i]) {
                missingValue = charInQueue;
                return missingValue;
            } else charInQueue += 1;
        }
        return missingValue;
    }


    public static char findMissingLetterXX(char[] array) {
        char missingValue = 0;
        char charInQueue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (charInQueue != array[i]) {
                missingValue = array[i];
                return missingValue;
            }
        }
        return missingValue;
    }
}

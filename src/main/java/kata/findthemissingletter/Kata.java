package kata.findthemissingletter;

public class Kata {
    public static char findMissingLetter(char[] array) {
        char missingValue = 0;
        char charInQueue = array[0];
        for (char anArray : array) {
            if (charInQueue != anArray) {
                return charInQueue;
            } else charInQueue += 1;
        }
        return missingValue;
    }

}

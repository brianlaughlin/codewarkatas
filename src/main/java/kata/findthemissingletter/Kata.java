package kata.findthemissingletter;

public class Kata {
    public static char findMissingLetter(char[] array) {

        char charInQueue = array[0];
        for (char anArray : array) {
            if (charInQueue != anArray) {
                return charInQueue;
            } else charInQueue += 1;
        }
        return 0;
    }

}

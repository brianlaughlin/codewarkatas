package kata.kyu8.findtheposition;

public class Kata {
    public static String position(char a) {
        char newChar = Character.toUpperCase(a);
        int ascii = (int) newChar - 64;
        return "Position of alphabet: " + String.valueOf(ascii);

    }

    public static String positionOneLine(char alphabet)
    {
        return "Position of alphabet: " + ((int) alphabet - 96);
    }
}

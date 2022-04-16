package kata.kyu7.lovevsfriendship;

public class Kata {
    public int wordsToMarks(String aWord) {
        int letter_value = 0;
        for (int i = 0; i < aWord.length(); i++) {
            char c = aWord.charAt(i);
            letter_value += alphabetPosition(c);
        }
        return letter_value;
    }

    public static int alphabetPosition(char c) {
        int ascii = (int) c;
        return ascii - 96;

    }
}

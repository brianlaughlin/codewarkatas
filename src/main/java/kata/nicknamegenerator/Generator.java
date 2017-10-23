package kata.nicknamegenerator;

public class Generator {

    public static String VOWELS = "aeiouAEIOU";

    public static String nickname(String name) {
        if (name.length() > 3) {
            return isVowel(name.charAt(2)) ? name.substring(0, 4) : name.substring(0, 3);
        }
        return "Error: Name too short";
    }

    public static boolean isVowel(char c) {
        return VOWELS.indexOf(Character.toUpperCase(c)) > 0;
    }

    static String nicknameBetter(final String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        return VOWELS.indexOf(name.charAt(2)) != -1 ?
                name.substring(0, 4) : name.substring(0, 3);
    }
}

package kata.regexp.isdigit;

public class StringUtils {
    public static boolean isDigit(String s) {
        return s.matches("\\d");
    }
}

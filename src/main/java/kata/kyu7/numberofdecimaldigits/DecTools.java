package kata.kyu7.numberofdecimaldigits;

public class DecTools {
    public static int Digits(long n) {
        return Long.toString(n).length();
    }

    // I think this looks ugly
    public static int DigitsByAddingString(long n) {
        return (""+n).length();
    }
}

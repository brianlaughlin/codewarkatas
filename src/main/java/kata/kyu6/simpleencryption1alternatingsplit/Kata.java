package kata.kyu6.simpleencryption1alternatingsplit;

/*
https://www.codewars.com/kata/57814d79a56c88e3e0000786/train/java

Fist stab I realized I was doing this wrong and need to rethink how to do it. Should have been more clear on my method
before starting.

I also wanted to do this using a stream, but again I started incorrectly.
Time: 38m

I can't even solve this manually. I get a totally different result.
 */

public class Kata {
    public static String encrypt(final String text, final int n) {

        if (n == 0) return text;

        StringBuilder result = new StringBuilder();
        StringBuilder phrase = new StringBuilder(text);

        int counter = 0;
        while (phrase.length() > 0) {

            if (counter == n) {
                result.append(phrase.charAt(0));
                phrase.deleteCharAt(0);
                counter = 0;
            } else {
                char letter = phrase.charAt(0);
                phrase.deleteCharAt(0);
                phrase.append(letter);
                counter++;
            }
        }

        return result.toString();
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        return null;
    }

}
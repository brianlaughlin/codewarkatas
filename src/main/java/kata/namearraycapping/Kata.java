package kata.namearraycapping;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class Kata {
    public static String[] capMe(String[] strings) {

        StringBuilder res = new StringBuilder();
        for (String str : strings) {
            char[] charArray = str.trim().toCharArray();  // convert to char array
            charArray[0] = toUpperCase(charArray[0]); // convert 1st letter
            IntStream.range(1, charArray.length)
                    .forEach(i -> charArray[i] = toLowerCase(charArray[i]));
            str = new String(charArray); // rebuild string

            res.append(str).append(" "); // Rebuild string
        }

        String[] result = res.toString().split(" ");

        return result;
    }


    public static String[] capMeStream(String[] strings) {
        return Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .toArray(String[]::new);
    }
}

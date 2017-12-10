package kata.kyu8.alternatingcases;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.Character.*;

public class StringUtils {
    public static String toAlternativeString(String string) {

        StringBuilder result = new StringBuilder();
        for(int i =0 ; i < string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))) {
                result.append(Character.toLowerCase(string.charAt(i)));
            } else {
                result.append(Character.toUpperCase(string.charAt(i)));
            }
        }
        return result.toString();
    }


    public static String toAlternativeStringStream(String string) {
        return string.chars()
                .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static String toAlternativeStringSreamBest(String string) {
        return Arrays.stream(string.split(""))
                .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
                .collect(Collectors.joining(""));
    }

}

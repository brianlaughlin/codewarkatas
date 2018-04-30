package kata.kyu7.antistring;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

public class JomoPipi {
    public static String antiString(String str) {

        StringBuilder result = new StringBuilder();
        StringBuilder reversedString = new StringBuilder(str).reverse();

        HashMap<Character, Character> lookup;
        StringBuilder numbers = new StringBuilder();
        StringBuilder alphaLowercase = new StringBuilder();


        lookup = buildLookupMaps(numbers, alphaLowercase);


        HashMap<Character, Character> finalLookup = lookup;
        for (int i = 0; i < str.length(); i++) {
            Character character = finalLookup.get(Character.toLowerCase(reversedString.charAt(i)));
            if (isUpperCase(reversedString, i)) character = Character.toLowerCase(character);
            else character = Character.toUpperCase(character);
            result.append(character);
        }

        return result.toString();
    }

    private static HashMap<Character, Character> buildLookupMaps(StringBuilder numbers, StringBuilder alphaLowercase) {
        HashMap<Character, Character> lookup;
        HashMap<Character, Character> lookupAlpha;
        lookup = buildLookupNumbers(numbers);
        lookupAlpha = buildLookupLowerAlpha(alphaLowercase);

        lookup.putAll(lookupAlpha);
        return lookup;
    }

    private static boolean isUpperCase(StringBuilder reversedString, int i) {
        return Character.isUpperCase(reversedString.charAt(i));
    }

    private static HashMap<Character, Character> buildLookupNumbers(StringBuilder numbers) {
        HashMap<Character, Character> lookup;
        IntStream.range(0, 10).forEach(numbers::append);
        StringBuilder numbersReversed = new StringBuilder(numbers).reverse();

        lookup = IntStream.range(0, numbers.length())
                .boxed()
                .collect(toMap(numbers::charAt, numbersReversed::charAt, (a, b) -> b, HashMap::new));
        return lookup;
    }

    private static HashMap<Character, Character> buildLookupLowerAlpha(StringBuilder alphaLowerCase) {
        HashMap<Character, Character> lookup;
        alphaLowerCase.append(IntStream.range('a', 'z' + 1)
                .mapToObj(i -> Character.toString((char) i))
                .collect(Collectors.joining()));

        StringBuilder alphaReversed = new StringBuilder(alphaLowerCase).reverse();

        lookup = IntStream.range(0, alphaLowerCase.length())
                .boxed()
                .collect(toMap(alphaLowerCase::charAt, alphaReversed::charAt, (a, b) -> b, HashMap::new));

        return lookup;
    }

    public static String antiStringSimpleAndClean(String str){
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray())
            sb.append( (char) (c<'A' ? ('9'+'0'-c) : ('z'+'A'-c)) );
        return sb.reverse().toString();
    }
}
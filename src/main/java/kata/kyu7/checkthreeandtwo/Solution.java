package kata.kyu7.checkthreeandtwo;

import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {

        Map<Character, Integer> characterCount = new HashMap<>();
        boolean hasThree = false;
        boolean hasTwo = false;

        for (Character ch : chars) {
            if (characterCount.containsKey(ch)) {
                characterCount.put(ch, characterCount.get(ch) + 1);
            } else {
                characterCount.put(ch, 1);
            }
        }

        for (Integer i : characterCount.values()) {
            if (i == 2) hasTwo = true;
            if (i == 3) hasThree = true;
        }

        return hasTwo && hasThree;
    }

    public static boolean checkThreeAndTwoStream(char[] chars) {
        return CharBuffer.wrap(chars)
                .chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .reduce(new Long(1), (a, b) -> b == 3 || b == 2 ? a * b : a) % 6 == 0;
    }


}

/*
I like this implementation.

 */
//class Solution {
//    private static final Collection<Long> twoAndThree = Arrays.asList(2L, 3L);
//
//    boolean checkThreeAndTwo(final char[] chars) {
//        return IntStream.range(0, chars.length)
//                .mapToObj(i -> chars[i])
//                .collect(groupingBy(identity(), counting()))
//                .values()
//                .containsAll(twoAndThree);
//    }
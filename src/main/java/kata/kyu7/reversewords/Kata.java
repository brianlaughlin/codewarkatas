package kata.kyu7.reversewords;


import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Kata: https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
 */

public class Kata {

    // Works but doesn't keep the spaces if there are more than one.
    public static String reverseWords(final String original) {
        String finalsb;

        String[] splited = original.split("\\s+");
        finalsb = Arrays.stream(splited).map(s -> new StringBuilder((CharSequence) s)
                .reverse())
                .map(sb -> (sb).append(" "))
                .collect(Collectors.joining());
        return finalsb.trim();
    }

    // Try this with a stack
    public static String reverseWordsStack(final String original) {
        StringBuilder finalResult = new StringBuilder();

        Stack<Character> stack = new Stack<Character>();
        for(char c : original.toCharArray()){
            if (c != ' ') {
                stack.push(c);
            } else {
                finalResult.append(popStack(stack));
                finalResult.append(" ");
                stack.empty();
            }
        }
        finalResult.append(popStack(stack));

        return finalResult.toString();
    }

    public static String popStack(Stack<Character> stack){
        String s = "";
        int size = stack.size();

        for(int i =0; i < size; i++) {
            s = s + stack.pop();
        }

        return s;
    }

    public static String reverseWordsBest(final String original)
    {
        String[] array = original.split(" ");

        if(array.length == 0)
            return original;


        int i = 0;
        for(String string : array){
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ",array);
    }

    public static String reverseWordsStream(final String original)
    {
        return original.trim().isEmpty() ? original : Stream.of(original.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
    }
}

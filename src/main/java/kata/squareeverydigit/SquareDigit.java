package kata.squareeverydigit;

import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {

        char[] numbers = ("" + n).toCharArray();

        StringBuilder result = new StringBuilder();
        for(char num: numbers){
            int n2 = (int) Math.pow(Double.parseDouble(String.valueOf(num)),2);
            result.append(n2);
        }
        return Integer.parseInt(String.valueOf(result));
    }


    public int squareDigitStream(int n){
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}

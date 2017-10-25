package kata.yourorderplease;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
    public static String order(String words) {

        String[] sentence;
        sentence = words.split(" ");
        String[] finalSentence = new String[sentence.length+1];

        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = null;
        String numberPosition;

        if(words == "") return "";
        for(int i=0; i < sentence.length; i++){
            matcher = pattern.matcher(sentence[i]);
            matcher.find();
            numberPosition = matcher.group();
            finalSentence[Integer.parseInt(numberPosition)] = sentence[i];
        }

        String result = "";
        result = finalSentence[1];
        for(int i=2; i < sentence.length + 1; i++) {
            result = result + " " + finalSentence[i];
        }
        return result;
    }

    public static String orderStreamSolution(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }

    public static String orderArraySort(String words) {
        String[] strs = words.split(" ");
        Arrays.sort(strs, (String s1, String s2) -> s1.replaceAll("[a-zA-Z]","").compareTo(s2.replaceAll("[a-zA-Z]",""))  );
        String f = "";
        for(String st:strs) f+=st + " ";
        return f.substring(0,f.length()-1);
    }

    public static String orderStringBuilder(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }
}

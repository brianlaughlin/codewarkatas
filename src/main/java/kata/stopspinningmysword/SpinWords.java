package kata.stopspinningmysword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SpinWords {
    public String spinWords(String sentence) {
        List<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        StringBuilder reverseWord = new StringBuilder();
        StringBuilder newSentence = new StringBuilder();

        for(int i = 0; i < words.size(); i++){
            if(i != 0 && i != words.size()) newSentence.append(" ");
            if(words.get(i).length() > 4) {
                reverseWord.append(words.get(i));
                words.set(i, reverseWord.reverse().toString());
                newSentence.append(words.get(i));
                reverseWord.setLength(0);
            } else {
                newSentence.append(words.get(i));
            }
        }
        return newSentence.toString();
    }

    public String spinWordsBetter(String sentence) {
        String[] words = sentence.split(" ");
        for (int i=0; i<words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }

    public String spinWordsStream(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}

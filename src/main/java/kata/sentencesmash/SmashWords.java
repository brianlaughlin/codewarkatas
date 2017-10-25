package kata.sentencesmash;

public class SmashWords {
    public static String smash(String... words) {

        String sentence = "";
        for(int i=0; i<words.length; i++){
            if (i==0) {
                sentence = words[0];
            } else sentence = sentence + " " + words[i];
        }

        return sentence;
    }


    public static String smashBetter(String... words) {
        return String.join(" ", words);
    }
}

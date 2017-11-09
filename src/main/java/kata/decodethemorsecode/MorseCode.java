package kata.decodethemorsecode;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    Map<String, String> codeMap;

    public MorseCode(){
        setMap();
    }

    private void setMap() {
        String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?" };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };

        codeMap = new HashMap<>();
        for(int i = 0; i < english.length; i++){
            codeMap.put(morse[i], english[i]);
        }
    }

    public String get(String code){

        return codeMap.get(code).toUpperCase();
    }
}

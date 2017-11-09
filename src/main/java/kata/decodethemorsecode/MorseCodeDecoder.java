package kata.decodethemorsecode;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)

        MorseCode mc = new MorseCode();
        morseCode = morseCode.trim();

        String[] words = morseCode.split("   ");
        StringBuilder english = new StringBuilder();

        for(String word: words){
            String[] byChar = word.split(" ");
            for(int i=0; i < byChar.length; i++){
                english.append(mc.get(byChar[i]));
            }
                english.append(" ");
        }

        return english.toString().trim();
    }


    public static String decodeBest(String morseCode) {
        MorseCode mc = new MorseCode();

        String result = "";
        for(String word : morseCode.trim().split("   ")) {
            for(String letter : word.split("\\s+")) {
                result += mc.get(letter);
            }
            result += ' ';
        }
        return result.trim();
    }
}

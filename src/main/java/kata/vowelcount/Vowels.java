package kata.vowelcount;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowels = "aeiou";
        str = str.toLowerCase();
        char[] orgStr = str.toCharArray();
        char[] vowelArray = vowels.toCharArray();

        for(int i = 0; i < str.length(); i++){
            for(int c = 0; c < vowelArray.length; c++){
                if(orgStr[i] == vowelArray[c]) vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static int getCountBest(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static int getCountClean(String str) {
        int vowelsCount = 0;

        for(char c : str.toCharArray())
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

        return vowelsCount;
    }

    public static int getCountILiked(String str) {
        return (int) str.chars().filter(c-> "aeiou".indexOf(c) >=0).count();
    }
}

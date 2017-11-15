package kata.getthemiddlecharacter;

public class Kata {
    public static String getMiddle(String word) {


        int mid = Math.round(word.length() / 2);
        boolean isEven;

        if(word.length() % 2 == 0) isEven = true;
        else isEven = false;

        if(isEven) {
            return String.valueOf(word.charAt(mid - 1)) +
                    String.valueOf(word.charAt(mid));
        } else return String.valueOf(word.charAt(mid));
    }

    public static String getMiddleBetter(String word){
        int length = word.length();

        return (length % 2 != 0) ? String.valueOf(word.charAt(length /2))
                : word.substring(length / 2 - 1, length / 2 + 1);
    }
}

package kata.creditcardmask;

public class Maskify {
    public static String maskify(String str) {

        if(str.length() < 4) return str;
        String lastFour = str.substring(str.length()-4, str.length());
        String result = "";
        for(int i =0; i < str.length() -4; i++){
            result += "#";
        }
        result += lastFour;

        return result;

    }


}

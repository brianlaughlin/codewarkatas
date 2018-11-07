package kata.kyu7.disemvoweltrolls;

public class Troll {
    public static String disemvowel(String str) {

        return str.replaceAll("[AEIOUaeiou]","");
    }
}
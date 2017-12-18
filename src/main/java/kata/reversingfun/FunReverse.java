package kata.reversingfun;

public class FunReverse {

    public static String funReverse(String s) {

        StringBuilder reverse = new StringBuilder(s).reverse();
        StringBuilder reverseFinal = new StringBuilder();

        for(int i=0; i < s.length(); i++){
            reverseFinal.append(reverse.charAt(0));
            reverse.deleteCharAt(0);
            reverse.reverse();
        }

        return reverseFinal.toString();
    }
}

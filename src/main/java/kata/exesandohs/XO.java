package kata.exesandohs;

public class XO {
    public static boolean getXO (String str) {

        String input = str.toUpperCase();
        int x = 0;
        int y = 0;

        for(int i=0; i < input.length(); i++){
            if(input.charAt(i) == 'X') x++;
            if(input.charAt(i) == 'O') y++;
        }

        return (x == y) ? true : false;
    }

    public static boolean getXOClever (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }


}

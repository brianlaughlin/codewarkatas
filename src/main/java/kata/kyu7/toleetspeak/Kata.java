package kata.kyu7.toleetspeak;

import java.util.HashMap;

public class Kata {
    static String toLeetSpeak(final String speak) {

        HashMap<Character, String> map = new HashMap<Character, String>();
        setupHashLookup(map);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < speak.length(); i++) {
            if (map.containsKey(speak.charAt(i))) result.append((map.get(speak.charAt(i))));
            else result.append(speak.charAt(i));
        }

        return result.toString();
    }

    private static void setupHashLookup(HashMap<Character, String> map) {
        map.put('A', "@");
        map.put('B', "8");
        map.put('C', "(");
        map.put('D', "D");
        map.put('E', "3");
        map.put('F', "F");
        map.put('G', "6");
        map.put('H', "#");
        map.put('I', "!");
        map.put('J', "J");
        map.put('K', "K");
        map.put('L', "1");
        map.put('M', "M");
        map.put('N', "N");
        map.put('O', "0");
        map.put('P', "P");
        map.put('Q', "Q");
        map.put('R', "R");
        map.put('S', "$");
        map.put('T', "7");
        map.put('U', "U");
        map.put('V', "V");
        map.put('W', "W");
        map.put('X', "X");
        map.put('Y', "Y");
        map.put('Z', "2");
        map.put(' ', " ");
    }
}

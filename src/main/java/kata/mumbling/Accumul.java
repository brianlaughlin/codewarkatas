package kata.mumbling;

public class Accumul {
    public static String accum(String s) {

        StringBuilder mumbles = new StringBuilder();
        Boolean doCap = true;

        char[] array = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (doCap) {
                mumbles.append(Character.toUpperCase(array[i]));
                doCap = false;
            }
            for (int t = 0; t < i; t++) {
                mumbles.append(Character.toLowerCase(array[i]));
            }
            if (i != s.length() - 1) {
                mumbles.append("-");
                doCap = true;
            }

        }

        return mumbles.toString();
    }

    public static String accumBest(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for (int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }


}

package kata.kyu7.speedofletters;

public class Kata {
    public static String speedify(final String input) {
        StringBuilder sb = new StringBuilder();
        sb.append("                                                                                         ");
        for (int i = 0; i < input.length(); i++) {
            int position = getCharVelocity(input.charAt(i), i);
            sb.replace(position, position, Character.toString(input.charAt(i)));
        }
        System.out.println("-----method answer-----");

        return sb.toString().trim();
    }

    private static int getCharVelocity(char c, int pos) {
        System.out.println((int) c - 65 + pos + 1);
        return (int) c - 65 + pos;
    }

    /*
    Not sure why I can't get the string .repeat to be recognized.
     */

//    static String speedifySolution(String input) {
//        StringBuilder sb = new StringBuilder(" ".repeat(132));
//        int idx = 0;
//        for (char c : input.toCharArray()) sb.setCharAt(idx++ + c - 'A', c);
//        return sb.toString().stripTrailing();
//    }

}
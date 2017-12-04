package kata.nextbiggernumberwiththesamedigit;


import java.util.Arrays;

public class KataFaster {
    public static long nextBiggerNumber(long n) {
        final String s = String.valueOf(n);

        int min = -1;
        int minPos = -1;
        for (int i = 1; i < s.length(); i++) {
            int right = Character.getNumericValue(s.charAt(i));
            int left = Character.getNumericValue(s.charAt(i - 1));
            if (right < left) {
                minPos = i;
                min = right;
                break;
            }
        }

        if (minPos == -1) {
            return -1;
        }

        int minNext = 9;
        int minNextPos = -1;
        for (int i = minPos + 1; i < s.length(); i++) {
            int current = Character.getNumericValue(s.charAt(i));
            if (current > min && current <= minNext) {
                minNext = current;
                minNextPos = i;
            }
        }

        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(minPos, Character.forDigit(minNext, 10));
        sb.setCharAt(minNextPos, Character.forDigit(min, 10));

        char[] charArray = sb.substring(minPos + 1).toCharArray();
        Arrays.sort(charArray);
        sb.replace(minPos + 1, s.length(), new String(charArray));

        return Long.valueOf(sb.toString());
    }
}

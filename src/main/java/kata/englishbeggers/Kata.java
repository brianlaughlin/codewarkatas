package kata.englishbeggers;

public class Kata {
    public static int[] beggerBounty;

    public static int[] beggars(int[] values, int n) {

        beggerBounty = new int[n];

        if(n == 0) return beggerBounty;
        int nextBegger = 0;
        for (int i = 0; i < values.length; i++) {
            beggerBounty[nextBegger] += values[i];
            nextBegger++;
            if (nextBegger > n-1) nextBegger = 0;
        }

        return beggerBounty;
    }
}
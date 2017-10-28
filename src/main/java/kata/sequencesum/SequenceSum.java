package kata.sequencesum;


public class SequenceSum {
    public static int[] sumOfN(int n) {

        int[] series = new int[Math.abs(n) + 1];
        int nextNumber = 0;

        for (int i = 0; i < Math.abs(n) + 1; i++) {
            if (n > 0) {
                nextNumber += i;
            } else nextNumber -= i;

            series[i] = nextNumber;
        }
        return series;
    }

    public static int[] sumOfNBetter(int n) {
        int[] result = new int[Math.abs(n) + 1];
        for (int i = 1; i < result.length; i++)
            result[i] = result[i - 1] + (n > 0 ? i : -i);
        return result;
    }
}

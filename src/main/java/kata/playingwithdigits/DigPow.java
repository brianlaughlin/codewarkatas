package kata.playingwithdigits;


public class DigPow {
    public static long digPow(int n, int p) {

        char[] number = ("" + n).toCharArray();

        int startExp = p;
        int exp = p;
        double result = 0;

        for (int i = 0; i < number.length; i++){
            result += Math.pow(Double.parseDouble(String.valueOf(number[i])),exp);
            exp++;
        }

        if ((result / n)  % 1 == 0){
            return (int) (result / n);
        } else
            return -1;
    }

    public static long digPowBest(int n, int p) {
        String intString = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < intString.length(); ++i, ++p)
            sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
        return (sum % n == 0) ? sum / n : -1;
    }
}

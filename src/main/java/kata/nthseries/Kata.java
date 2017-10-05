package kata.nthseries;

import java.text.DecimalFormat;

public class Kata {

    public static String seriesSum(int n) {
        int incrementBy = 3;
        int denominator = 4;  // Starting value for denominator
        Double seriesValue = 1.0;

        if(n==0){
            return "0.00";
        } if (n==1) {
            return "1.00";
        } else {
            for (int i=2; i <= n; i++){
                seriesValue += (1.0/denominator);
                denominator += incrementBy;
            }
            DecimalFormat df = new DecimalFormat("#.00");
            return df.format(seriesValue);
        }
    }

    public static String seriesSumBestPratice(int n) {

        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);

    }

}

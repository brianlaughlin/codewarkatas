package kata.highestandlowest;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class KataHighestLowest {
    public static String HighAndLow(String numbers) {

        Integer highest = null;
        Integer lowest = null;
        List<String> numberList = Arrays.asList(numbers.split(" "));
        for(String temp: numberList){
            if (highest == null){
               highest = Integer.parseInt(temp);
            }
            if (lowest == null){
                Integer tempLowest = Integer.parseInt(temp);
                if(highest > tempLowest  || highest == tempLowest){
                    lowest = tempLowest;
                } else {
                    lowest = highest;
                    highest = tempLowest;
                }
            }

            // Main checking conditional
            if (highest < Integer.parseInt(temp)){
                highest = Integer.parseInt(temp);
            }
            if (lowest > Integer.parseInt(temp)) {
                lowest = Integer.parseInt(temp);
            }
        }

        return highest.toString() + " " + lowest.toString();
    }



    public static String HighAndLowBetter(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }

    public static String HighAndLowBest(String numbers) {
        IntSummaryStatistics stats = Arrays.stream(numbers.split("\\s")).
                mapToInt(Integer::parseInt).summaryStatistics();

        return String.format("%d %d", stats.getMax(), stats.getMin());
    }

}

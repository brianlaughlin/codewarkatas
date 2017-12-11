package kata.weightforweight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WeightSort {

    public static String orderWeight(String strng) {

        List<String> weightList = new ArrayList<String>(Arrays.asList(strng.split(" ")));

        List<Integer> weightListInt = addDigitsSortList(weightList);

        System.out.println(weightListInt);

        List<String> finalWeightList = new ArrayList<>();
        for(int i = 0; i < weightListInt.size(); i++){
            for(String weight: weightList){
                if(sumDigitsReturnInt(Integer.parseInt(weight)) == weightListInt.get(i).intValue()){
                    finalWeightList.add(weight);
                }
            }
        }

        String result = String.join(" ", finalWeightList);

        return result;
    }

    private static List<Integer> addDigitsSortList(List<String> weightList) {
        List<Integer> weightListInt = weightList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int bound = weightListInt.size();
        for (int i = 0; i < bound; i++)
            weightListInt.set(i,
                    sumDigitsReturnInt(weightListInt.get(i))
            );

        Collections.sort(weightListInt);
        return weightListInt;
    }

    private static Integer sumDigitsReturnInt(Integer num) {
        String s = String.valueOf(num);
        char[] numString = s.toCharArray();
        int sumLetters = IntStream.range(0, numString.length)
                .map(i -> Character.getNumericValue(numString[i]))
                .sum();

        return sumLetters;
    }

    private static String sumDigitsReturnString(String s) {
        char[] nums = s.toCharArray();
        int sumLetters = IntStream.range(0, nums.length)
                .map(i -> Character.getNumericValue(nums[i]))
                .sum();

        return String.valueOf(sumLetters);
    }
}


/*
  Read list and add digits
  Sort list
  Convert list back to weights in sorted order
  Create string
  Display string of weights
 */

//        IntStream.range(0, weightList.size())
//                .forEachOrdered(i -> weightList.add(
//                        sumDigitsReturnString(weightList.get(i))
//                ));
//
//
//        Collections.sort(weightList);
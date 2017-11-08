package kata.findtheoddint;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.stream;

public class FindOdd {

    public static int findIt(int[] A) {
        Map<Integer, Integer> numbers = new HashMap<>();
        processNumbers(A, numbers);

        return findOddNumber(numbers);
    }

    private static void processNumbers(int[] A, Map<Integer, Integer> numbers) {
        Integer newCount = 0;
        for(int i=0; i< A.length; i++){
            if(numbers.containsKey(Integer.valueOf(A[i]))){
                newCount = numbers.get(A[i]);
                newCount++;
                numbers.put(Integer.valueOf(A[i]), newCount);
            } else {
                numbers.put(Integer.valueOf(A[i]), 1);
            }
        }
    }

    private static int findOddNumber(Map<Integer, Integer> numbers) {

        return numbers.entrySet()
                .stream()
                .filter(n -> n.getValue() % 2 == 1)
                .findFirst()
                .get()
                .getKey();
    }

    public static int findItBest(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }

    public static int findItStream(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }

    public static int findItClean(int[] A) {
        int odd=0;
        for (int item: A)
        {
            odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        }

        return odd;
    }
}

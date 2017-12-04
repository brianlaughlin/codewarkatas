package kata.nextbiggernumberwiththesamedigit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {

    public static List<Long> allNumbers;

    public Kata(List<Long> allNumbers) {
        allNumbers = new ArrayList<>();
        this.allNumbers = allNumbers;
    }

    public static long nextBiggerNumber(long n) {

        String str = Long.toString(n);

        int n1 = str.length();
        Kata permutation = new Kata(allNumbers);
        permutation.permute(str, 0, n1 - 1, allNumbers);

        Collections.sort(allNumbers);

        for (int i = 0; i < allNumbers.size(); i++) {
            if (n == allNumbers.get(i) && n != allNumbers.get(i + 1)) {
                return allNumbers.get(i + 1);
            }
        }

        return -1;
    }

    private void permute(String str, int l, int r, List<Long> saveList) {
        if (l == r) {
            saveList.add(Long.parseLong(str));
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, saveList);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

class findPivot {

    public static int point(Long n){

        // convert to list. Note it's in reverse order
        List<Integer> numbers = new ArrayList<>();
        do{
            numbers.add((int) (n % 10));
            n /= 10;
        } while (n > 0);

        // find first left digit smaller than right.
        int location = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) > numbers.get(i + 1)){
                System.out.println("Number found: " + numbers.get(i + 1));
                location = i + 1;
                break;
            }
        }

        return location;
    }

    public static long nextBiggerNumberBest(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        for (int i = digits.length-1; i > 0; i--) {
            if (digits[i] > digits[i-1]) {
                int nBiggerIndex = i;
                for (int j = digits.length-1; j > i; j--) {
                    if (digits[j] > digits[i-1]) {
                        nBiggerIndex = j;
                        break;
                    }
                }
                char temp = digits[nBiggerIndex];
                digits[nBiggerIndex] = digits[i-1];
                digits[i-1] = temp;
                Arrays.sort(digits, i, digits.length);
                return Long.parseLong(new String(digits));
            }
        }
        return -1;
    }
}

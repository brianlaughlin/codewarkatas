package kata.nextbiggernumberwiththesamedigit;

import java.util.Arrays;

public class NextGreater {
    // Utility function to swap two digit
    static void swap(char ar[], int i, int j)
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // Given a number as a char array number[],
    // this function finds the next greater number.
    // It modifies the same array to store the result
    static long findNext(long n)
    {
        StringBuilder result = new StringBuilder();
        char[] ar = new char[(int) (Math.log10(n) + 1)];

        for (int i = ar.length - 1; i >= 0; i--) {
            ar[i] = (char) ('0' + (n % 10));
            n /= 10;
        }
        int i;

        // I) Start from the right most digit
        // and find the first digit that is smaller
        // than the digit next to it.
        for (i = ar.length - 1; i > 0; i--)
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }

        // If no such digit is found, then all
        // digits are in descending order means
        // there cannot be a greater number with
        // same set of digits
        if (i == 0)
        {
            System.out.println("Not possible");
        }
        else
        {
            int x = ar[i - 1], min = i;

            // II) Find the smallest digit on right
            // side of (i-1)'th digit that is greater
            // than number[i-1]
            for (int j = i + 1; j < ar.length; j++)
            {
                if (ar[j] > x && ar[j] < ar[min])
                {
                    min = j;
                }
            }

            // III) Swap the above found smallest
            // digit with number[i-1]
            swap(ar, i - 1, min);

            // IV) Sort the digits after (i-1)
            // in ascending order
            Arrays.sort(ar, i, ar.length);
            System.out.print("Next number with same" +
                    " set of digits is ");

            for (i = 0; i < ar.length; i++){
                System.out.print(ar[i]);
                result.append(ar[i]);
            }
        }

        return Long.parseLong(result.toString());
    }

    public static void main(String[] args)
    {
//        char digits[] = { '5','3','4','9','7','6' };
//        int n = digits.length;
        System.out.println(findNext(534976L));
    }
}
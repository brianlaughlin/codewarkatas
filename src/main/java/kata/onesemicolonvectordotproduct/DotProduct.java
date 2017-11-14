package kata.onesemicolonvectordotproduct;

import java.util.stream.IntStream;

public class DotProduct {
    public static int dotOrg(int[] a, int[] b) {
        // FIXME Too many semicolons!
        int product = 0;
        for (int i = 0; i < a.length; i++) {
            product += a[i] * b[i];
        }
        return product;
    }

    // didn't realize to pass the  library in the return.
    // Since this function called on an import it caused 2 semicolons
    // This function didn't pass.
    public static int dot(int[] a, int[] b) {

        return IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
    }


    public static int dotWinner(int[] a, int[] b) {
        return  java.util.stream.IntStream.range(0, a.length).map(i ->  a[i] * b[i]).sum();
    }
}

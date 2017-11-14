package kata.onesemicolonvectordotproduct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DotProductTest {
    @Test
    public void test() {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {4, 5, 6};
        Assert.assertEquals(DotProduct.dot(a, b), 32);
    }

}
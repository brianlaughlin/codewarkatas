package kyu4.snail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;
import java.util.Arrays;
import java.util.Random;
import static java.util.stream.Collectors.joining;

public class SnailTest {

    @Test
    public void SnailTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }

    public String int2dToString(int[][] a) {
        return Arrays.stream(a).map(row -> Arrays.toString(row)).collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        // print out restul
        int[] r = Snail.snail(array);
        System.out.println("result: " + Arrays.toString(r));
        Assert.assertArrayEquals(result, r);

        // print out array
        System.out.println("array: " + int2dToString(array));

        Assert.assertArrayEquals( result, Snail.snail(array));
    }

    public void testHighestScore(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        // print out restul
        int[] r = Snail.snailHighestScore(array);
        System.out.println("result: " + Arrays.toString(r));
        Assert.assertArrayEquals(result, r);

        // print out array
        System.out.println("array: " + int2dToString(array));

        Assert.assertArrayEquals( result, Snail.snail(array));
    }

    @Test
    public void SnailTestEmptyArray() {
        int[][] array = {};
        int[] result = {};
        test(array, result);
    }

    @Test
    public void SnailTest2() {
        int[][] array
                = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[] r = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
        test(array, r);
    }

    @Test
    public void SnailTest3() {
        int[][] array
                = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        int[] r = {1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13};
        test(array, r);
    }

    // write test for snailHighestScore
    @Test
    public void SnailHighestScoreTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        testHighestScore(array, r);
    }

}

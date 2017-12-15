package kata.sortheodd;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, Kata.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, Kata.sortArray(new int[]{5, 3, 1, 8, 0}));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
    }



    @Test
    public void dropEven() {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(4);
        result.add(3);
        result.add(2);
        result.add(5);
        int[] resultInt = new int[]{1,4,3,2,5};

        assertArrayEquals(resultInt , Kata.sortArray(new int[]{5, 4, 3, 2, 1}));

    }
}

/*
Create sorted array list of odd numbers
loop array and build new array by checking if odd
    if even use array number else use List


 */
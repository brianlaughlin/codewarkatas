package kata.kyu8.larioandmuigipipeproblem;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KataTest {

    @Test
    public void test1(){
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, Kata.pipeFix(new int[] {1,2,3,5,6,8,9}));
    }

    @Test
    public void test2(){
        assertArrayEquals(new int[] {6,7,8,9}, Kata.pipeFix(new int[] {6,9}));
    }


    @Test
    public void tests() {
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, Kata.pipeFix(new int[] {1,2,3,5,6,8,9}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, Kata.pipeFix(new int[] {1,2,3,12}));
        assertArrayEquals(new int[] {6,7,8,9}, Kata.pipeFix(new int[] {6,9}));
        assertArrayEquals(new int[] {-1,0,1,2,3,4}, Kata.pipeFix(new int[] {-1,4}));
        assertArrayEquals(new int[] {1,2,3}, Kata.pipeFix(new int[] {1,2,3}));
    }
}
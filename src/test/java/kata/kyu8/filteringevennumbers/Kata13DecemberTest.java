package kata.kyu8.filteringevennumbers;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Kata13DecemberTest {

    @Test
    public void firstTest() throws Exception {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expectedResult,Kata13December.filterOddNumber(listOfNumbers));
    }

    @Test
    public void secondTest()
    {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Kata13December.filterOddNumber(listOfNumbers).toArray()));
    }

    @Test
    public void negNumber(){
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(-1, 0, -1, 0, -1));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(-1, -1, -1));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Kata13December.filterOddNumber(listOfNumbers).toArray()));

    }

}
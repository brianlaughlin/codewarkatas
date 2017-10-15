package kata.findcountmostelementinarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void mostFrequentItemCount() throws Exception {
    }

    @Test
    public void tests() {
        assertEquals(2, Kata.mostFrequentItemCount(new int[] {3, -1, -1}));
    }

    @Test
    public void tests2() {
        assertEquals(5, Kata.mostFrequentItemCount(new int[] {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3}));
    }

}
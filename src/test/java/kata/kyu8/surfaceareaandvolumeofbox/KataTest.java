package kata.kyu8.surfaceareaandvolumeofbox;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class KataTest {

    @Test
    public void test1() {
        Kata k = new Kata();

        assertArrayEquals(new int[] { 88, 48 }, k.getSize(4, 2, 6));
        assertArrayEquals(new int[] { 6, 1 }, k.getSize(1, 1, 1));
        assertArrayEquals(new int[] { 10, 2 }, k.getSize(1, 2, 1));
        assertArrayEquals(new int[] { 16, 4 }, k.getSize(1, 2, 2));
        assertArrayEquals(new int[] { 600, 1000 }, k.getSize(10, 10, 10));
    }

}
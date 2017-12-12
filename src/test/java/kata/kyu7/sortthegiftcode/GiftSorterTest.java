package kata.kyu7.sortthegiftcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GiftSorterTest {
    @Test
    public void Tests1() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("sort fedcba", "abcdef", gs.sortGiftCode("fedcba"));
    }

    @Test
    public void Tests2() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("reverse alphabet", "abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

}
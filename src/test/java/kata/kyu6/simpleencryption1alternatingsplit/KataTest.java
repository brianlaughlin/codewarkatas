package kata.kyu6.simpleencryption1alternatingsplit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void testEncrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Kata.encrypt("This is a test!", 0));
        assertEquals("24153", Kata.encrypt("12345", 1));
        assertEquals("hsi  etTi sats!", Kata.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", Kata.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", Kata.encrypt("This is a test!", 3));
        assertEquals("This is a test!", Kata.encrypt("This is a test!", 4));
        assertEquals("This is a test!", Kata.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", Kata.encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", Kata.decrypt("This is a test!", 0));
        assertEquals("This is a test!", Kata.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", Kata.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", Kata.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", Kata.decrypt("This is a test!", 4));
        assertEquals("This is a test!", Kata.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", Kata.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        // assertEquals("expected", "actual");
        assertEquals("", Kata.encrypt("", 0));
        assertEquals("", Kata.decrypt("", 0));
        assertEquals(null, Kata.encrypt(null, 0));
        assertEquals(null, Kata.decrypt(null, 0));
    }
}
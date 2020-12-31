package kata.kyu7.isogram;

import org.junit.Assert;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IsogramTest {

    @Test
    public void testIsIsogram() throws Exception {
        boolean result = Isogram.isIsogram("str");
        Assert.assertEquals(true, result);
    }

    @Test
    public void FixedTests() {
        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isogram.isIsogram("isogram"));
        assertEquals(false, Isogram.isIsogram("moose"));
        assertEquals(false, Isogram.isIsogram("isIsogram"));
        assertEquals(false, Isogram.isIsogram("aba"));
        assertEquals(false, Isogram.isIsogram("moOse"));
        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isogram.isIsogram(""));
    }
}


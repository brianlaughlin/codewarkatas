package kata.kyu8.fakebinary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakeBinaryTest {
    @Test
    public void testSomething() {
        assertEquals(FakeBinary.fakeBin("5"), "1");
        assertEquals(FakeBinary.fakeBin("222999"), "000111");
    }

    @Test
    public void testSomethingBest() {
        assertEquals(FakeBinary.fakeBinBest("5"), "1");
        assertEquals(FakeBinary.fakeBinBest("222999"), "000111");
    }
}
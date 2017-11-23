package kata.duplicateencoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }

    @Test
    public void test1(){
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
    }
}
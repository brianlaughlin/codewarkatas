package kata.kyu8.dnatornaconversion;

import org.junit.Test;

import static org.junit.Assert.*;

public class BioTest {
    @Test
    public void testDna() throws Exception {
        Bio b = new Bio();
        assertEquals(b.dnaToRna("TTTT"), b.dnaToRna("TTTT"), "UUUU");
    }

    @Test
    public void testDna2() throws Exception {
        Bio b = new Bio();
        assertEquals(b.dnaToRna("GCAT"), b.dnaToRna("GCAT"), "GCAU");
    }
}
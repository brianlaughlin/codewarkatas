package kata.decodethemorsecode;

import org.junit.Test;
import org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MorseCodeDecoderTest {
    @Test
    public void decode() throws Exception {

        MorseCodeDecoder morseCodeDecoder = new MorseCodeDecoder();
        assertEquals("S", MorseCodeDecoder.decode("..."));

    }

    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));

    }

    @Test
    public void testE(){
        assertEquals("E", MorseCodeDecoder.decode("."));
    }

}
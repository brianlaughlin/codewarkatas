package kata.namearraycapping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void downcase() {
        String[] strings = new String[] {"jo", "nelson", "jurie"};
        assertEquals(new String[] {"Jo", "Nelson", "Jurie"}, Kata.capMe(strings));
    }

    @Test
    public void failedCase(){
        String[] strings  = new String[] {"Ror", "NOR", "xor"};
        assertEquals(new String[] {"Ror", "Nor", "Xor"}, Kata.capMe(strings));
    }
}
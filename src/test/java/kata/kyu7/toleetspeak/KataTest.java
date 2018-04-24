package kata.kyu7.toleetspeak;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void test1(){
        assertEquals("1337", Kata.toLeetSpeak("LEET"));
    }

    @Test
    public void testNull(){
        assertEquals("[", Kata.toLeetSpeak("["));
    }

    @Test
    public void testSomething() {

        assertEquals("(0D3W@R$", Kata.toLeetSpeak("CODEWARS"));
        assertEquals("#3110 W0R1D", Kata.toLeetSpeak("HELLO WORLD"));
        assertEquals("10R3M !P$UM D010R $!7 @M37", Kata.toLeetSpeak("LOREM IPSUM DOLOR SIT AMET"));
        assertEquals("7#3 QU!(K 8R0WN F0X JUMP$ 0V3R 7#3 1@2Y D06", Kata.toLeetSpeak("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
    }
}
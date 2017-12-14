package kata.findthemissingletter;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

    @Test
    public void Test1(){
        assertEquals(65, Kata.findMissingLetter(new char[] {'A'}));
        assertEquals(66, Kata.findMissingLetter(new char[] {'B'}));
    }

}

/*
Read String and turn to char
incremnt char with counter
if counter != char return letter

Try first using TDD Method I'll check in at each stage so I can see progression
 */
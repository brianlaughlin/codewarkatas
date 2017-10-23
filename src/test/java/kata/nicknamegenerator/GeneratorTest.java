package kata.nicknamegenerator;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratorTest {

    @Test
    public void testSomething() {
        assertEquals("Jim", Generator.nickname("Jimmy"));
        assertEquals("Sam", Generator.nickname("Samantha"));
        assertEquals("Error: Name too short", Generator.nickname("Sam"));
        assertEquals("Kay", Generator.nickname("Kayne"));
        assertEquals("Mel", Generator.nickname("Melissa"));
        assertEquals("Jam", Generator.nickname("James"));
    }

    @Test
    public void test1() {
        assertEquals("Jean", Generator.nickname("Jeannie"));
    }

}
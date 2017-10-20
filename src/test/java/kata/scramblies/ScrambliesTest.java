package kata.scramblies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScrambliesTest {


    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("rkqodlw", "world"), true);
        testing(Scramblies.scramble("cedewaraaossoqqyt", "codewars"), true);
        testing(Scramblies.scramble("katas", "steak"), false);
        testing(Scramblies.scramble("scriptjavx", "javascript"), false);
        testing(Scramblies.scramble("scriptingjava", "javascript"), true);
        testing(Scramblies.scramble("scriptsjava", "javascripts"), true);
        testing(Scramblies.scramble("javscripts", "javascript"), false);
        testing(Scramblies.scramble("aabbcamaomsccdd", "commas"), true);
        testing(Scramblies.scramble("commas", "commas"), true);
        testing(Scramblies.scramble("sammoc", "commas"), true);
    }

    @Test
    public void testTrue() {
        testing(Scramblies.scrambleBetter("aabbcamaomsccdd", "commas"), true);
        testing(Scramblies.scramble("commas", "commas"), true);
        testing(Scramblies.scramble("sammoc", "commas"), true);
    }

    @Test
    public void testFalse() {
        testing(Scramblies.scrambleBetter("katas", "steak"), false);
        testing(Scramblies.scrambleBetter("scriptjavx","javascript"),false);
        testing(Scramblies.scrambleBetter("javscripts","javascript"),false);
        testing(Scramblies.scrambleBetter("javx", "java"), false);
    }

}
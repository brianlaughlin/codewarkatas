package kata.adamandeve;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/*
Ended up putting test in this package because I was having a problem recognizing the classes.
 */

public class GodTest {
    @Test
    public void makingAdam() {
        Human[] paradise = God.create();
        assertEquals("Adam is a man", true, paradise[0] instanceof Man);
    }

    @Test
    public void makingEve() {
        Human[] paradise = God.create();
        assertEquals("Eve is a woman", true, paradise[1] instanceof Woman);
    }

    @Test
    public void makingAdamNotWoman() {
        Human[] paradise = God.create();
        assertEquals("Adam is a woman", false, paradise[0] instanceof Woman);
    }

    @Test
    public void makingAbel() {
        Human[] outOfParadise = God.create();
        assertEquals("Abel is a man", true, outOfParadise[2] instanceof Man);
    }

}
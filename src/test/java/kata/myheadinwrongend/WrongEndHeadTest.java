package kata.myheadinwrongend;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class WrongEndHeadTest {


    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{"tail", "body", "head"},
                WrongEndHead.fixTheMeerkat(new String[]{"head", "body", "tail"}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{"tails", "body", "heads"},
                WrongEndHead.fixTheMeerkat(new String[]{"heads", "body", "tails"}));
    }


    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{"bottom", "middle", "top"},
                WrongEndHead.fixTheMeerkat(new String[]{"top", "middle", "bottom"}));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{"lower legs", "torso", "upper legs"},
                WrongEndHead.fixTheMeerkat(new String[]{"upper legs", "torso", "lower legs"}));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{"ground", "rainbow", "sky"},
                WrongEndHead.fixTheMeerkat(new String[]{"sky", "rainbow", "ground"}));
    }

    @Test
    public void exampleTest10() {
        assertArrayEquals(new String[]{"lower legs", "torso", "upper legs"},
                WrongEndHead.fixTheMeerkatILikeThisOne(new String[]{"upper legs", "torso", "lower legs"}));
    }
}
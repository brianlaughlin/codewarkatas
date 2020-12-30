package kata.kyu7.lovevsfriendship;

import org.junit.Assert;
import org.junit.Test;

public class KataTest {
    Kata kata = new Kata();

    @Test
    public void testWordsToMarks() throws Exception {
        int result = kata.wordsToMarks("aWord");
        Assert.assertEquals(100, kata.wordsToMarks("attitude"));
        Assert.assertEquals(75, kata.wordsToMarks("friends"));
        Assert.assertEquals(66, kata.wordsToMarks("family"));
        Assert.assertEquals(99, kata.wordsToMarks("selfness"));
        Assert.assertEquals(96, kata.wordsToMarks("knowledge"));
    }
}
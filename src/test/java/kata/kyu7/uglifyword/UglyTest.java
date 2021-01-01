package kata.kyu7.uglifyword;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertEquals;


public class UglyTest {

    @Test
    public void sampleTest() {
        assertEquals("AaA", Ugly.uglifyWord("AAA"));
        assertEquals("AaA", Ugly.uglifyWord("AaA"));
        assertEquals("BbB", Ugly.uglifyWord("BbB"));
        assertEquals("AaA-BbB-CcC", Ugly.uglifyWord("aaa-bbb-ccc"));
        assertEquals("AaA-BbB-CcC", Ugly.uglifyWord("AaA-BbB-CcC"));
        assertEquals("EeEe-FfFf-GgGg", Ugly.uglifyWord("eeee-ffff-gggg"));
        assertEquals("EeEe-FfFf-GgGg", Ugly.uglifyWord("EeEe-FfFf-GgGg"));
        assertEquals("QwE123AsDf456ZxC", Ugly.uglifyWord("qwe123asdf456zxc"));
        assertEquals("HeLlO WoRlD", Ugly.uglifyWord("Hello World"));
    }
}

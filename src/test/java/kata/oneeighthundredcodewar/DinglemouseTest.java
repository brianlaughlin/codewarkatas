package kata.oneeighthundredcodewar;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DinglemouseTest {
    private Set<String> show(final Set<String> set) {
        System.out.println(set.toString());
        return set;
    }

    @Test
    public void example() {
        final Set<String> expected = new HashSet<>();
        expected.add("1-800-CODE-WAR");
        expected.add("1-800-CODE-YAP");
        expected.add("1-800-CODE-WAS");
        expected.add("1-800-CODE-ZAP");
        assertEquals(expected, show(Dinglemouse.check1800("1-800-CODE-WAR")));
    }

    @Test
    public void test1() {
        final Set<String> expected = new HashSet<>();
        expected.add("1-800-CODE-WAR");
        assertEquals(expected, show(Dinglemouse.check1800("1-800-CODE-WAR")));
    }

    @Test
    public void fixString() {
        String[] newString = Dinglemouse.PRELOADEDWORDS();
        for (String s : newString) {
            System.out.println(s);
        }
    }

    @Test
    public void checkNumberTest() {
        final Set<String> expected = new HashSet<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        assertEquals(expected, show(Dinglemouse.checkNumber(2)));
    }

    @Test
    public void testLetterCombo() {
        System.out.println(
                Dinglemouse.letterCombinations("949")
        );

    }

    @Test
    public void testConvertToDigits(){
        assertEquals("927", Dinglemouse.convertToDigitis("WAR"));

    }

}
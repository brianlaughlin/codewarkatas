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
    public void notPassing() {
        final Set<String> expected = new HashSet<>();
        expected.add("1-800-OPEN-PAW");
        expected.add("1-800-OPEN-SAW");
        expected.add("1-800-OPEN-SAY");
        assertEquals(expected, show(Dinglemouse.check1800("1-800-OPEN-PAW")));
    }


    @Test
    public void notPassing2() {
        final Set<String> expected = new HashSet<>();
        expected.add("1-800-JOB-LION");
        assertEquals(expected, show(Dinglemouse.check1800("1-800-JOB-LION")));
    }

    @Test
    public void notPassing3() {
        final Set<String> expected = new HashSet<>();
        expected.add("1-800-XXXX-XXX");
        expected.add("1-800-XXX-XXXX");
        assertEquals(expected, show(Dinglemouse.check1800("1-800-XXXX-XXX")));
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
    public void fixString() {
        String[] newString = Dinglemouse.PRELOADEDWORDS();
        for (String s : newString) {
            System.out.println(s);
        }
    }

    @Test
    public void testLetterCombo() {
        System.out.println(
                Dinglemouse.letterCombinations("949")
        );

    }

    @Test
    public void testConvertToDigits() {
        assertEquals("927", Dinglemouse.convertToDigitis("WAR"));
        assertEquals("2633", Dinglemouse.convertToDigitis("CODE"));

    }

    @Test
    public void testConvertToDigitsCombineWord() {
        assertEquals("5625466", Dinglemouse.convertToDigitis("JOBLION"));

//        // Test letter combo on larger String
//        List<String> allCombos = Dinglemouse.letterCombinations("5625466");
//
//        Set<String> phoneFirstPart = new HashSet<>();
//        Set<String> phoneSecondPart = new HashSet<>();
//
//        IntStream.rangeClosed(0, 1)
//                .forEachOrdered(i -> { allCombos.stream()
//                .map(s -> s.substring(0, 3 + i))
//                .forEach(phoneFirstPart::add);
//        });
//
//        for (String s : phoneFirstPart) {
//            System.out.println(s);
//        }

        final Set<String> expected = new HashSet<>();
        expected.add("1-800-JOB-LION");
        assertEquals(expected, show(Dinglemouse.check1800("1-800-JOB-LION")));

    }

}
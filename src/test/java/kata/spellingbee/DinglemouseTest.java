package kata.spellingbee;

import org.junit.Test;

import static org.junit.Assert.*;

public class DinglemouseTest {
    private static char [][] show(final char [][] hive) {
        for (int y = 0; y < hive.length; y++) {
            System.out.println(hive[y]);
        }
        return hive;
    }

    @Test
    public void ex10() {
        final char hive[][] = new char[][] {
                "b...eebee".toCharArray(),
                "e.b.be.ee".toCharArray(),
                "be.be.e.e".toCharArray(),
                "..bebe.ee".toCharArray(),
                ".e..eebbe".toCharArray(),
                ".e.eebb.e".toCharArray(),
                "..ee.eebb".toCharArray(),
                "eeebb...e".toCharArray(),
                ".bebe.ee.".toCharArray()
        };
        assertEquals(10, Dinglemouse.howManyBees(show(hive)));
    }

    @Test
    public void ex1() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                ".e..e..".toCharArray(),
                ".b..eeb".toCharArray()
        };
        assertEquals(5, Dinglemouse.howManyBees(show(hive)));
    }

    @Test
    public void ex2() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                "e.e.e.e".toCharArray(),
                "eeb.eeb".toCharArray()
        };
        assertEquals(8, Dinglemouse.howManyBees(show(hive)));
    }

    @Test
    public void twoLines() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                "bee.bee".toCharArray()
        };
        assertEquals(4, Dinglemouse.howManyBees(show(hive)));
    }

    @Test
    public void threeBeesReveres() {
        final char hive[][] = new char[][] {
                "eeb.eeb.eeb".toCharArray(),
                "eee.eee.eee".toCharArray()
        };
        assertEquals(3, Dinglemouse.howManyBees(show(hive)));
    }

    @Test
    public void threeBees() {
        final char hive[][] = new char[][] {
                "bee.bee.bee".toCharArray(),
                "...e...e...".toCharArray()
        };
        assertEquals(3, Dinglemouse.howManyBees(show(hive)));
    }
}
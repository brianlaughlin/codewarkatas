package kata.kyu7.fixme1234;

import java.util.HashMap;
import java.util.Map;

public class Dinglemouse {
    private static final Map<String, MyNumber> cache = new HashMap<>();

    static enum MyNumber {
        ONE(1, "one", "ichi", "un"),
        TWO(2, "two", "ni", "deux"),
        THREE(3, "three", "san", "trois"),
        FOUR(4, "four", "shi", "quatre")
        ;

        private final int val;

        private MyNumber(int val, String ...names) {
            this.val = val;
            for (final String n : names) cache.put(n, this);
        }

        public int intValue() {
            return this.val;
        }

    }

    static MyNumber dummy = MyNumber.ONE; // Reference the static enum so it initialises!

    static MyNumber getNumber(final String name) {

        return cache.get(name);
    }

}
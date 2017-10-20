package kata.describealist;

import java.util.List;

public class Kata {
    public static String describeList(final List list) {
        if (list.isEmpty()) return "empty";
        if (list.size() == 1)  {
            return "singleton";
        } else return "longer";
    }

    public static String describeListBetter(final List list) {
        switch (list.size()) {
            case 0: return "empty";
            case 1: return "singleton";
            default: return "longer";
        }
    }
}

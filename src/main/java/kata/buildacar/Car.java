package kata.buildacar;

import java.util.stream.IntStream;

public class Car {
    static Body body;
    static Chassis chassis;

    public Car(int length, int doors) throws Exception {

        if (doors == 0) throw new Exception();
        if (length < 7) throw new Exception();
        if (length - (doors * 2) < 3) throw new Exception();

        body = new Body(length, doors);
        chassis = new Chassis(length);
    }


    public static int getNumAxles(int length) {
        int axles;
        if (length < 12) return 2;
        else if (length == 12) return 3;
        else {
            axles = ((length - 12) / 2) + 1 + 2;
        }

        return axles;

    }

    public static String showTop(int topLength) {
        StringBuilder result = new StringBuilder(" ");
        for (int i = 1; i < topLength - 2; i++) result.append("_");

        return result.toString();
    }

    public static String showMiddle(int midLength, int doors) {

        StringBuilder result = new StringBuilder();
        result.append("|");
        IntStream.range(1, midLength - 4)
                .mapToObj(j -> " ")
                .forEach(result::append);
        result.append("  \\");

        int left = 1; // even left door
        int right = 4; // odd right door
        for (int i = 1; i < doors + 1; i++) {
            if (i % 2 == 1) {
                result.setCharAt(midLength - right, '[');
                result.setCharAt(midLength - right + 1, ']');
                right += 2;
            } else {
                result.setCharAt(left, '[');
                result.setCharAt(left + 1, ']');
                left += 2;
            }
        }

        return result.toString();
    }

    public static String showBottom(int bottomLength) {
        StringBuilder result = new StringBuilder();

        IntStream.range(0, bottomLength - 1)
                .mapToObj(j -> "-")
                .forEach(result::append);
        result.append("'");

        int axles = getNumAxles(bottomLength);

        int left = 1;
        int right = 3;
        for (int i = 1; i < axles + 1; i++) {
            if (i % 2 == 1) {
                result.setCharAt(left, 'o');
                left += 2;
            } else {
                result.setCharAt(bottomLength - right, 'o');
                right += 2;
            }
        }

        return result.toString();
    }

    public class Body {
        public final String component;

        Body(int length, int doors) {
            this.component = Car.showTop(length) + "\n" + Car.showMiddle(length, doors);
        }
    }

    public class Chassis {
        public final String component;

        Chassis(int length) {
            this.component = "\n" + Car.showBottom(length);

        }
    }
}

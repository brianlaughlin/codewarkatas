package kata.buildacar;

import java.util.stream.IntStream;

public class Car {
    static Body body;
    static Chassis chassis;

    public Car(int length, int doors) {
        body = new Body("Hello");
        chassis = new Chassis("7");
        //   chassis.component = " world";

    }


    public static int getNumAxles(int length) {
        int axles = 0;
        if (length < 12) return 2;
        else if (length == 12) return 3;
        else {
            axles = ((length - 12) / 2) + 1 + 2;
        }

        return axles;

    }

    public static String showTop(int topLength) {
        String result = " ";
        for (int i = 1; i < topLength - 2; i++) result += "_";

        return result;
    }

    public static String showMiddle(int midLength) {

        StringBuilder result = new StringBuilder();
        result.append("|");
        for (int i = 1; i < midLength - 4; i++) {
            result.append(" ");
        }

        result.append("[]\\");

        return result.toString();
    }

    public static String showBottom(int bottomLength) {
        StringBuilder result = new StringBuilder();
        // result += "-";

        // Better to do the following:
        // Build bottom --------- completely
        // replace with tires -o------o-
        // Will reduce looping and tracking

        IntStream.range(0, bottomLength - 1)
                .mapToObj(j -> "-")
                .forEach(result::append);
        result.append("'");

        int axles = getNumAxles(bottomLength);

        int left = 1;
        int right = 3;
        for (int i = 1; i < axles + 1; i++) {
            if (i  % 2 == 1) {
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
        public String component;

        public Body(String component) {
            this.component = Car.showTop(7) + "\n" + Car.showMiddle(7);
        }
    }

    public class Chassis {
        public String component;

        public Chassis(String component) {
            this.component = "\n" + Car.showBottom(7);

        }
    }
}

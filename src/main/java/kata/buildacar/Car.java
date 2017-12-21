package kata.buildacar;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Car {
    static Body body;
    static Chassis chassis;

    public Car(int length, int doors) {
        body = new Body("Hello");
        chassis = new Chassis();
        chassis.component=" world";

    }

    public static String showTop(int topLength) {
        String result = " ";
        for(int i=1; i < topLength - 2; i++) result += "_";

        return result;
    }

    public static String showMiddle(int midLength) {

        String result = "";
        result += "|";
        for(int i=1; i< midLength-4; i++){
            result += " ";
        }

        result += "[]\\";

        return result;
    }

    public static String showBottom(int bottomLength) {
        StringBuilder result = new StringBuilder();
       // result += "-";

        // Better to do the following:
        // Build bottom --------- completely
        // replace with tires -o------o-
        // Will reduce looping and tracking

        for(int j = 0; j < bottomLength - 1; j++){
            result.append("-");
        }
            result.append("'");

        if(bottomLength < 12){
            result.setCharAt(1, 'o');
            result.setCharAt(bottomLength -3, 'o');
        }

        return result.toString();
    }

    public class Body {
        public String component;

        public Body(String component) {
            this.component = component;
        }
    }

    public class Chassis {
        public String component;
    }
}

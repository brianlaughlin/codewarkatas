package kata.buildacar;

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

    public static String showBottom(int i) {

        return "-o--o-'";
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

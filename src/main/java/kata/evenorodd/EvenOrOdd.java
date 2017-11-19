package kata.evenorodd;

public class EvenOrOdd {
    public static String even_or_odd(int number) {

        if (number % 2 == 0) return "Even";
                else return "Odd";

    }


    public static String even_or_oddStream(int number) {

        return (number % 2 == 0) ? "Even" : "Odd";


    }

}

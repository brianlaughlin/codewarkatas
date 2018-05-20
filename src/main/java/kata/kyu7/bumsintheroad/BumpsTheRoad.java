package kata.kyu7.bumsintheroad;

public class BumpsTheRoad {
    public static String bumps(final String road) {

        long count = road.chars().filter(c -> c == 'n').count();
        return (count < 15) ? "Woohoo!" : "Car Dead";
    }
}
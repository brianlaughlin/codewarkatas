package kata.kyu8.numberofpeopleinthebus;

import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {

        return stops.stream()
                    .mapToInt(s -> s[0] - s[1])
                    .sum();

    }
}

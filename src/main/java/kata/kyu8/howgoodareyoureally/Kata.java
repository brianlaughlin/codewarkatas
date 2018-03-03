package kata.kyu8.howgoodareyoureally;

import java.util.stream.IntStream;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

         return IntStream.of(classPoints).sum() / classPoints.length < yourPoints;
    }
}

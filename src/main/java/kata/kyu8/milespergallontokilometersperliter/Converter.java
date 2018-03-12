package kata.kyu8.milespergallontokilometersperliter;

public class Converter {
    public static float mpgToKPM(final float mpg) {

        return (float) Math.round(mpg * 1.609344 / 4.54609188 * 100) / 100;

    }

    public static float mpgToKPMOtherSolution(final float mpg) {
        return (float) Math.round(100 * mpg * 1.609344 / 4.54609188) / 100;
    }
}

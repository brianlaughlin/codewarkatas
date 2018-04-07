package kata.kyu8.grasshopperdebug;

public class GrassHopper {
    public static String weatherInfo(int temp) {
        Double c = convertToCelsius(temp);
        if (c < 0)
            return (c.doubleValue() + " is freezing temperature");
        else
            return (c.doubleValue() + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        Double celsius = (temperature - 32) * (5/9.0);
        return celsius;
    }
}
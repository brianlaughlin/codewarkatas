package kata.kyu8.fuelcalculator;

public class Kata {
    public static double fuelPrice(int litres, double pricePerLiter) {

        double discount = Math.round(litres / 2);
        discount = discount * 0.05;

        if(discount > 0.25) discount = 0.25;

        return (pricePerLiter - discount) * litres;
    }

    public static double fuelPriceSimple(int litres, double price) {
        return litres * (price - Math.min(litres / 2 * 0.05, 0.25));
    }
}

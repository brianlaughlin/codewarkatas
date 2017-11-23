package kata.growthofpopulation;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {

        int population = p0;

        int years = 0;
        while (population < p){
            population += population * (percent / 100) + aug;
            years++;
        }
        return years;
    }
}

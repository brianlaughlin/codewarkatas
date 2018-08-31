package kata.kyu8.twiceasold;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears) {

        float dad = dadYears;
        float son = sonYears;
        int yearCount = 0;
        int result = 0;

        if (sonYears == 0) return dadYears;
        if (dad / son > 2) {
            while (dad / son != 2) {
                dad++;
                son++;
                yearCount++;
            }
        } else {
            while (dad / son != 2) {
                dad--;
                son--;
                yearCount++;
            }
        }

        return yearCount;
    }

    public static int TwiceAsOldSimple(int dadYears, int sonYears){
        return Math.abs((sonYears*2)-dadYears);

    }
}

package kata.kyu8.catyearsdogyears;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int yearOne = 15;
        int yearTwo = 24;
        int catYrs = 0;
        int dogYrs = 0;

        if (humanYears == 1) {
            catYrs = yearOne;
            dogYrs = yearOne;
        } else if (humanYears == 2) {
            catYrs = yearTwo;
            dogYrs = yearTwo;
        } else if (humanYears >= 3) {
            catYrs = yearTwo + ((humanYears - 2) * 4);
            dogYrs = yearTwo + ((humanYears - 2) * 5);
        }

        return new int[]{humanYears, catYrs, dogYrs};
    }

    public static int[] humanYearsCatYearsDogYearsShortest(final int y) {
        return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
    }
}

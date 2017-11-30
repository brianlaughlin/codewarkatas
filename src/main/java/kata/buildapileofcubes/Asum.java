package kata.buildapileofcubes;

public class Asum {

    public static long findNbTooLong(long m) {
        long volume = 0L;
        int level = 0;
        while (volume < m) {
            level++;
            volume += level * level * level;
            System.out.println(level + "m = " + m);
        }

        if (volume != m) return -1;

        return volume;
    }

    //  think long is giving me rounding errors
    public static long findNb(long m) {
        int n = 0;
        while (m > 0) {
            n++;
            m -= Math.pow(n, 3);
            System.out.println("n = " + n + " m = " + m);
        }
        return m != 0 ? -1 : (long) n;
    }

    public static int findNBDouble(long m){
        int n = 0;
        double num = (double) m;
        while (num > 0) {
            n++;
            num -= Math.pow(num, 3);
        }
        System.out.println(num);
        return num != 0 ? -1 : n;
    }

    // Solve failed test 55100
    public static void findNbFailed1(long m){
       int n = 0;
       long volume = 0L;
       while (n < m){
           n++;
           volume += Math.pow(n, 3);
       }
        System.out.println("n: " + n + " m: " + volume);

    }

    public static long findNbBest(long m) {
        long mm = 0, n = 0;
        while (mm < m) mm += ++n * n * n;
        return mm == m ? n : -1;
    }

}

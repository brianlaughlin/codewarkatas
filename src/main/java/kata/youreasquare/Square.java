package kata.youreasquare;

public class Square {
    public static boolean isSquare(int n) {

        double sqrt = Math.sqrt(n);
        int x = (int) sqrt;
        return (Math.pow(sqrt, 2) == Math.pow(x, 2) ? true : false);
    }

    public static boolean isSquareBest(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static boolean isSquareBetter(int n) {
        return Math.sqrt(n) == (int)Math.sqrt(n)? true:false;
    }

}
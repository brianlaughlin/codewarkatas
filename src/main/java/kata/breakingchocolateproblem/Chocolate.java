package kata.breakingchocolateproblem;

public class Chocolate {
    public static int breakChocolate(int n, int m) {

        if(n < 1 || m < 1) return 0;
        return (n * m) - 1;
    }

    public static int breakChocolateBest(int n, int m){
        return Math.max(n * m - 1, 0);
    }
}

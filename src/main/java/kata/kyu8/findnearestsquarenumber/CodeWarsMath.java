package kata.kyu8.findnearestsquarenumber;

public class CodeWarsMath {
        public static int nearestSq(int n){

            int nSqrt = (int) ((int)(Math.sqrt((float) n) + .5f));
            return (int) Math.pow((int) nSqrt, 2);
        }

    public static int nearestSqClean(int n) {
        int base = (int) Math.round(Math.sqrt(n));
        return base * base;
    }
    }

package kata.findthenextperfectsquare;

public class NumberFun {
    public static long findNextSquare(long sq) {

        if(Math.sqrt(sq) % 1 != 0) return -1;

        Long result = sq+1;
        while(Math.sqrt(result) % 1 != 0){
            result++;
        }
        return result;
    }

    public static long findNextSquareCleaver(long sq) {
        long root = (long) Math.sqrt(sq);
        return root * root == sq ? (root + 1) * (root + 1) : -1;
    }


}

package kata.fibonaccilastdigit;

public class Fibonacci {
    public static int getFibNumb(int n) {
//
//        return getFibNumb(n) % 10;
//    }
//
//    public Long getFibNumber(int n){
//        Long fibNumber = Long.valueOf(n);
//        System.out.println(fibNumber);
//        if(fibNumber == 0) return 0L;
//        if(fibNumber == 1) return 1L;
//        return getFibNumber(n -1) + getFibNumber(n -2);
//    }


            int n1 = 1;
            int n2 = 1;
            for(int i = 3; i <= n; i++){
                int temp = n1;
                n1 = n2;
                n2 = (n2 + temp)%10;
            }
            return n2;
        }

}

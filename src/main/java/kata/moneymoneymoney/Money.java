package kata.moneymoneymoney;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {

        double total = principal;
        int year = 0;
        if(principal == desired) return 0;

        while(total < desired){
            total += (total * interest) - (total * interest * tax);
            year++;
        }


        return year;
    }
}

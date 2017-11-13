package kata.persistentbugger;

public class Persist {
    public static int persistence(long n) {

        int count = 0;
        long product = n;
        while(product > 9){
            product = String.valueOf(product)
                    .chars()
                    .map(Character::getNumericValue)
                    .reduce(1,(a,b) -> a* b);
            count++;
        }
        return count;
    }
}

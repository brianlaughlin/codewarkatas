package kata.sumofdigitsdigitalroot;

public class DRoot {
    public static int digital_root(int n) {

        int sum = n;
        while(sum > 9) {
            sum = String.valueOf(sum)
                    .chars()
                    .map(Character::getNumericValue)
                    .sum();
        }
        return sum;
    }

    public static int digital_rootShorter(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}

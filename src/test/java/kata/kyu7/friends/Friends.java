package kata.kyu7.friends;

public class Friends {

    public static int friends(int n) {
        int friend = 0;
        int max = 2;
        while (n > max) {
            friend++;
            max *= 2;
        }
        return friend;
    }
}

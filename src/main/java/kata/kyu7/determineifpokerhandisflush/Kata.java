package kata.kyu7.determineifpokerhandisflush;

public class Kata {
    public static boolean CheckIfFlush(String[] cards) {

        int hearts = 0;
        int spades = 0;
        int clubs = 0;
        int diamonds = 0;


        for (String card : cards) {
            if (card.contains("H")) hearts++;
            if (card.contains("S")) spades++;
            if (card.contains("C")) clubs++;
            if (card.contains("D")) diamonds++;
        }


        return (hearts == 5) || (spades == 5) || (clubs == 5) || (diamonds == 5);
    }
}
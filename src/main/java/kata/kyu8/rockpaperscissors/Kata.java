package kata.kyu8.rockpaperscissors;

public class Kata {
    public static String rps(String p1, String p2) {

        String player1Wins = "Player 1 won!";
        String player2Wins = "Player 2 won!";
        if(p1.equals(p2)) return "Draw!";

        if(p1.equals("paper") && p2.equals("rock")) return player1Wins;
        if(p1.equals("paper") && p2.equals("scissors")) return player2Wins;

        if(p1.equals("rock") && p2.equals("scissors")) return player1Wins;
        if(p1.equals("rock") && p2.equals("paper")) return player2Wins;

        if(p1.equals("scissors") && p2.equals("paper")) return player1Wins;

        return player2Wins;
    }

    public static String rpsTenary(String p1, String p2) {
        if(p1 == p2) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + " won!";
    }

    public static String rpsSimple(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";
        String result = p1 + p2;
        int winner = "scissorspaper".equals(result) || "rockscissors".equals(result) || "paperrock".equals(result) ? 1 : 2;
        return String.format("Player %d won!", winner);
    }
}

package kata.kyu8.totalamountofpoints;

public class TotalPoints {
    public static int points(String[] games) {

        int scoreTotal = 0;

        for(int i = 0; i < games.length; i++){
            String score[] = games[i].split(":");

            int ourScore = Integer.parseInt(score[0]);
            int opponentScore = Integer.parseInt(score[1]);

            if(ourScore > opponentScore) scoreTotal += 3;
            if(ourScore < opponentScore) scoreTotal += 0;
            if(ourScore == opponentScore) scoreTotal += 1;
        }

        return scoreTotal;
    }
}
package kata.kyu7.goingtothecinma;

public class Movie {
    public static int movie(int card, int ticket, double perc) {
        int movieCount = 1;

        if(card == 0) return 2;

        Double ticketPerc = ticket * perc;
        Double totalCardPrice = card + ticketPerc;
        double totalTicketPrice = ticket;

        while(totalTicketPrice <= Math.ceil(totalCardPrice)){
            ticketPerc *= perc;
            totalCardPrice += ticketPerc;
            totalTicketPrice += ticket;

            movieCount++;
        }
        return movieCount;
    }

    public static int movieBest(int card, int ticket, double perc) {
        int count = 0;
        double totalB = card;

        while (ticket * count <= Math.ceil(totalB))
            totalB += ticket * Math.pow(perc, ++count);

        return count;
    }

}

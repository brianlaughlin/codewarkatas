package kata.nthseries;

import kata.nthseries.Kata;

class NthSeries {

    public static void main(String args[]){


        for(int i = 0; i < 100; i++) {
            System.out.println("Round " + i + " is " + Kata.seriesSum(i) +
            " vs " + Kata.seriesSumBestPratice(i));
        }
    }

}

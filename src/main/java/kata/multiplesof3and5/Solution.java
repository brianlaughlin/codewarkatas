package kata.multiplesof3and5;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int number) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for(int i=0; i<number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                multiples.add(i);
            }
        }

        int sum = 0;
        for(Integer multiple: multiples){
            sum += multiple;
        }

        return sum;
    }

    public int solutionSimple(int number) {
        int sum=0;

        for (int i=0; i < number; i++){
            if (i%3==0 || i%5==0){sum+=i;}
        }
        return sum;
    }

    public int solutionStream(int number) {

        System.out.println((IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .summaryStatistics()));

        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();

    }
}

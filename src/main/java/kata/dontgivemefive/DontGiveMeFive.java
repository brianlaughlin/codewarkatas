package kata.dontgivemefive;


// Note I was thinking this needed to not end in 5 so it didn't out for numbers like 50.
public class DontGiveMeFive {
    public static int dontGiveMeFive(int start, int end)
    {
        int count = 0;
        for(int i = start; i <= end; i++)
            if( Math.abs(i) % 10 != 5){
                count++;
                System.out.println(i);
            }
        return count;
    }
}

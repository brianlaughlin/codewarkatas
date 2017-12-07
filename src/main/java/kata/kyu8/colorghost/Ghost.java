package kata.kyu8.colorghost;

import java.util.Random;

public class Ghost {
    String color;
    Random random;

    public Ghost() {
        random = new Random();
    }

    public String getColor() {
        int c = random.nextInt(4) + 1;
        switch(c){
            case 1: return "white";
            case 2: return "yellow";
            case 3: return "puprle";
            case 4: return "red";
        }
        return color;
    }
}

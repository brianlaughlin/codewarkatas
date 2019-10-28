package kata.possibilitiesofthrowingacoinntimes;
// Coding link:
// https://www.codewars.com/kata/possibilities-of-throwing-a-coin-n-times/train/java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    ArrayList<String> result = new ArrayList<>();
    KataSimpleSolution Simple = new KataSimpleSolution();

    public String[] coin(int n) {

        return new String[]{"Hello", "There"};
    }


}

class KataSimpleSolution {
    public String[] coin(int n) {
        int t = (int)Math.pow(2,n);

        String[] r = new String[t];
        for (int i = 0; i < t; i++) r[i] = pad(Integer.toBinaryString(i), n).replace("0","H").replace("1","T");
        return r;
    }
    public String pad(String s, int l) {
        while (s.length() < l) s = 'H' + s;
        return s;
    }


    public class KataSolutionUsingArrayList {
        public String[] coin(int n) {
            List<String> l = new ArrayList<>();
            l.add("H");
            l.add("T");
            for (int i = 2; i <= n; i++) {
                List<String> t = new ArrayList<>();
                for (String x : l) {
                    t.add(x + "H");
                    t.add(x + "T");
                }
                l.clear();
                l.addAll(t);
            }
            Collections.sort(l);
            String[] r = new String[l.size()];
            for (int i = 0; i < l.size(); i++) {
                r[i] = l.get(i);
            }
            return r;
        }
    }
}

class Coin {
    private String heads = "H";
    private String tails = "T";
    private String side;

    public Coin() {
        this.side = heads;
    }

    public String getSide() {
        return side;
    }

    String flip() {
        if (side.equals(heads)) {
            side = tails;
        } else {
            side = heads;
        }

        return side;
    }


    public static void main(String[] args) {

        Kata k = new Kata();
        CreateCoins createCoins = new CreateCoins(3);
        ArrayList<Coin> coins = createCoins.coins;

//        for (int t = 0; t < coins.size(); t++) {
//            Coin currentCoin = coins.get(t);
//            addCoins(k.result, coins);
//            currentCoin.flip();
//            addCoins(k.result, coins);
//        }


        // Manual process -->
        // Pattern is wrong
        addCoins(k.result, coins);

        Coin currentCoin = coins.get(0);
        currentCoin.flip();
        addCoins(k.result, coins);

        currentCoin = coins.get(1);
        currentCoin.flip();
        addCoins(k.result, coins);

        currentCoin = coins.get(2);
        currentCoin.flip();
        addCoins(k.result, coins);

        currentCoin = coins.get(0);
        currentCoin.flip();
        addCoins(k.result, coins);

        currentCoin = coins.get(1);
        currentCoin.flip();
        addCoins(k.result, coins);

        currentCoin = coins.get(2);
        currentCoin.flip();
        addCoins(k.result, coins);

        currentCoin = coins.get(0);
        currentCoin.flip();
        addCoins(k.result, coins);


        for (String s : k.result) {
            System.out.print(s);
        }

        System.out.println("\nNumber of possible sides are " + k.result.size());
    }

    private static void addCoins(ArrayList<String> result, ArrayList<Coin> coins) {
        for (Coin c : coins) {
            result.add(c.getSide());
        }
    }


    private static class CreateCoins {

        ArrayList<Coin> coins = new ArrayList<>();

        public CreateCoins(int numberCoins) {
            for (int i = 0; i < numberCoins; i++) {
                coins.add(new Coin());
            }
        }

    }

}










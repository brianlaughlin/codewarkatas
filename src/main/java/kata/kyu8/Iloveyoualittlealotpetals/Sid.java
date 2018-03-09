package kata.kyu8.Iloveyoualittlealotpetals;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

        switch(nb_petals % 6){
            case 0: return "not at all";
            case 1: return "I love you";
            case 2: return "a little";
            case 3: return "a lot";
            case 4: return "passionately";
            case 5: return "madly";

        }
        return "";
    }

    public static String howMuchILoveYouAnotherWay(int nb_petals) {

        String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};

        return arr[nb_petals%6];
    }
}

package kata.kyu8.correctmistakesofocrsoftware;

public class Correct {
    public static String correct(String string) {

        String stringFinal = string.replace('1','I')
                .replace('0','O')
                .replace('5','S');

        return stringFinal;
    }
}

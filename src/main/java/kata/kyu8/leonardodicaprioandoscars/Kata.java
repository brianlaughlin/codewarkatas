package kata.kyu8.leonardodicaprioandoscars;

public class Kata {
    public static String leo(final int oscar) {

        String message = null;
        if (oscar == 88) return "Leo finally won the oscar! Leo is happy";
        if (oscar == 86) return "Not even for Wolf of wallstreet?!";
        if (oscar > 88 ) return "Leo got one already!";

        return "When will you give Leo an Oscar?";
    }
}

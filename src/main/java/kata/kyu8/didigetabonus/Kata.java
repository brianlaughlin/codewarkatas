package kata.kyu8.didigetabonus;

public class Kata {

    public static String bonusTime(final int salary, final boolean bonus) {
        // show me the code!

        return bonus ? "£" + Integer.toString(salary * 10)
                : "£" + Integer.toString(salary);
    }

    public static String bonusTimeSimple(final int salary, final boolean bonus) {
        return "\u00A3" + (bonus ? 10 : 1) * salary;
    }
}

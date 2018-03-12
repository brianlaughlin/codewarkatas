package kata.kyu8.stringtemplatebugfix5;

public class Kata {
    public static String buildString(String... args) {

        if (args[0].equals("")) return "I like ";

        StringBuilder sb = new StringBuilder("I like ");
        if (args.length == 1) return "I like " + args[0] + "!";
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
            if (i == args.length - 1) sb.append("!");
            else sb.append(", ");
        }
        return sb.toString();
    }

    public static String buildStringBest(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}

package kata.printererrors;

public class Printer {
    public static String printerError(String s) {
        s = s.toLowerCase();
        String bad = "[nopqrstuvwxyz]";
        int orgLength = s.length();
        int hasBad = 0;
        int hasGood = 0;

        hasGood = s.toLowerCase()
                .replaceAll(bad, "")
                .length();

        hasBad = orgLength - hasGood;
        String result = hasBad + "/" + orgLength;

        return result;


    }

    public static String printerErrorBetter(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }

    public static String printerErrorBetter2(String s) {
        long errs = s.chars().filter( ch -> ch > 'm').count();
        return errs+"/"+s.length();
    }
}

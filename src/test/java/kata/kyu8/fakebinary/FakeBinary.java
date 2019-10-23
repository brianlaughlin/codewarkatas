package kata.kyu8.fakebinary;

public class FakeBinary {

    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            char c = numberString.charAt(i);
            if (Character.getNumericValue(c) < 5) result.append("0");
            else
                result.append("1");
        }
        return result.toString();
    }

    public static String fakeBinBest(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

}

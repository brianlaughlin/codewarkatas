package kata.kyu7.uglifyword;

public class Ugly {
    public static String uglifyWord(String str) {
        Boolean isFlag = true;
        StringBuilder result = new StringBuilder();

        for (Character c : str.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isAlphabetic(c)) {
                result.append(c);
                isFlag = true;
            }
            if (Character.isDigit(c)) {
                isFlag = true;
                result.append(c);
            } else if (Character.isAlphabetic(c)) {
                if (isFlag) result.append(Character.toUpperCase(c));
                else result.append(Character.toLowerCase(c));
                isFlag = !isFlag;
            }
        }
        return result.toString();
    }

    public static String uglifyWordShorter(String str) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = flag ? Character.toUpperCase(c) : Character.toLowerCase(c);
                flag = !flag;
            } else {
                flag = true;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
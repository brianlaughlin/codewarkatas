package kata.jadencasing;

public class JadenCase {
    public String toJadenCase(String phrase) {

        if (phrase != null && !phrase.isEmpty()) {
            StringBuilder res = new StringBuilder();
            String[] strArg = phrase.split(" ");

            setFirstLetterUpperCase(res, strArg);
            return res.toString().trim();
        } else {
            return null;
        }
    }

    private void setFirstLetterUpperCase(StringBuilder res, String[] strArg) {
        for (String str : strArg) {
            char[] charArray = str.trim().toCharArray();  // convert to char array
            charArray[0] = Character.toUpperCase(charArray[0]); // convert 1st letter
            str = new String(charArray); // rebuild string

            res.append(str).append(" "); // Rebuild string
        }
    }
}

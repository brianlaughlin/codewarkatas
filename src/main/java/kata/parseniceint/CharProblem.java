package kata.parseniceint;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// I like my solution it's more robust than other 3
public class CharProblem {
    public static int howOld(final String herOld) {

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(herOld);

        int age = 0;
        while (m.find()) age = Integer.parseInt(m.group());

        return age;
    }

    public static int howOld1(final String herOld) {

        return Character.getNumericValue(herOld.charAt(0));
    }

    public static int howOld2(final String herOld) {

        String s = herOld.substring(0,1);
        return Integer.parseInt(s);

    }

    public static int howOld3(String answer) {
        return answer.charAt(0) - '0';
    }


}

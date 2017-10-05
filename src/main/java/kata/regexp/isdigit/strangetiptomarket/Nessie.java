package kata.regexp.isdigit.strangetiptomarket;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nessie {
    public static boolean isLockNessMonster(String s){
        System.out.println(s.contains("tree fiddy") || s.contains("3.50"));  // One way to do this
        return Pattern.matches(".*(tree fiddy|3\\.50|three fifty).*", s);  // Another way to do it
    }
}

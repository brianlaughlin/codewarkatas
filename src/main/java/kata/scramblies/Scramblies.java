package kata.scramblies;

import java.util.ArrayList;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {

        ArrayList<Character> list1 = new ArrayList<Character>();
        for (char c : str1.toCharArray()) {
            list1.add(c);
        }

        ArrayList<Character> list2 = new ArrayList<Character>();
        for (char c : str2.toCharArray()) {
            list2.add(c);
        }

        ArrayList<Character> finalList = new ArrayList<Character>();
        for (int t = 0; t < list1.size(); t++) {
            for (int t2 = 0; t2 < list2.size(); t2++) {
                if (list1.get(t).equals(list2.get(t2))) {
                    finalList.add(list2.get(t2));
                    list2.remove(t2);
                    break;
                }
            }
        }

        if (list2.size() == 0) return true;

        return false;
    }

    public static boolean scrambleBetter(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (String s: str2.split("")) {
            if (!str1.contains(s))  return false;
            str1 = str1.replaceFirst(s,"");
        }

        return true;
    }
}

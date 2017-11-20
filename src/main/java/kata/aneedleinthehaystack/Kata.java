package kata.aneedleinthehaystack;

public class Kata {
    public static String findNeedle(Object[] haystack) {

        int position = 0;
        for(Object obj: haystack){
            if(obj != null){
                if(obj.equals(String.valueOf("needle"))) {
                    return "found the needle at position " + position;
                }
            }
            position++;
        }
        return null;
    }

    public static String findNeedleBest(Object[] haystack) {
        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }
}

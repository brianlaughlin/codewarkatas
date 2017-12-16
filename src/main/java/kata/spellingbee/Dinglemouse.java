package kata.spellingbee;

public class Dinglemouse {
    public static int howManyBees(final char[][] hive) {


        if (hive == null || hive.length == 0 || hive[0].length == 0) return 0;

        int beeCount = 0;

        String beeString = "";
        String beeStringB = "";
        String beeStringHorizontal = "";
        String beeStringVertial = "";

        beeStringHorizontal = beesHorizontal(hive, beeStringB);
        beeStringVertial += beesVertical(hive, beeStringB);

        beeString = beeStringHorizontal + "..." + beeStringVertial;
        int idx = 0;
        while ((idx = beeString.indexOf("bee", idx)) != -1) {
            idx++;
            beeCount++;
        }

        idx = 0;
        while ((idx = beeString.indexOf("eeb", idx)) != -1) {
            idx++;
            beeCount++;
        }

        return beeCount;
    }

    private static String beesVertical(char[][] hive, String beeStringB) {
        for (int j = 0; j < hive[0].length; j++) {
            for (int i = 0; i < hive.length; i++) {
                beeStringB += hive[i][j];
            }
            beeStringB += ".";
        }
        return beeStringB;
    }

    private static String beesHorizontal(char[][] hive, String beeStringB) {
        for (char[] hive1D : hive) {
            for (char c : hive1D) {
                System.out.print(c);
                beeStringB += c;
            }
            beeStringB += ".";
        }
        return beeStringB;
    }

}

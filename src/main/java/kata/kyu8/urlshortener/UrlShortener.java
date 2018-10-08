package kata.kyu8.urlshortener;

public class UrlShortener {

    private static String mapBase = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String base62(int i) {

        int n = i;
        StringBuilder shortUrl = new StringBuilder();
        if (n == 0) shortUrl.append("a");
        while (n > 0) {
            shortUrl.append(mapBase.charAt(n % 62));
            n = n / 62;
        }

        return shortUrl.toString();
    }
}

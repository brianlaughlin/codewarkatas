package kata.kyu8.findtheslope;

public class Slope {
    public String slope(int[] points) {
        /*
           a:x1
   b:y1
   c:x2
   d:y2
         */
        int a = points[0];
        int b = points[1];
        int c = points[2];
        int d = points[3];

        int m = ((d - b) / (c - a));

        return String.valueOf(m);
    }

    public String slopebest(int[] points)
    {
        int deltaY = points[3] - points[1];
        int deltaX = points[2] - points[0];
        if (deltaX == 0) {
            return "undefined";
        }
        return String.valueOf(deltaY / deltaX);
    }
}

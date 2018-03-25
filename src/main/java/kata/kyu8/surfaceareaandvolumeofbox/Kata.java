package kata.kyu8.surfaceareaandvolumeofbox;

public class Kata {
    public int[] getSize(int w,int h,int d) {
        int area = 2 * (h * w) + 2 * (h * d) + 2 * (w * d);
        int vol = w * h * d;

        return new int[] {area, vol};
    }
}

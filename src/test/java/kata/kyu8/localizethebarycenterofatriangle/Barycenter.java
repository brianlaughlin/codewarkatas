package kata.kyu8.localizethebarycenterofatriangle;

public class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z)
    {
        double x0 = (x[0] + y[0] + z[0]) / 3.0;
        double y0 = (x[1] + y[1] + z[1]) / 3.0;

        double scale = Math.pow(10, 4);
        double[] result = new double[]{Math.round(x0 * scale) / scale,
                                       Math.round(y0 * scale) / scale};
        return result;
    }
}

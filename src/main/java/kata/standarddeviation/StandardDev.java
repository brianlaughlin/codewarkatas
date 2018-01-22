package kata.standarddeviation;

import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;

public class StandardDev {
    public double getDev(double[] numSet) {

        StandardDeviation st = new StandardDeviation();
        double result = st.evaluate(numSet);

        return result;
    }
}

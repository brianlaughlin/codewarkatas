package kata.standarddeviation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandardDevTest {

    double[] numSet = new double[]{10,2,38,23,38,23,21};

    @Test
    public void testDev(){

        StandardDev st = new StandardDev();
        assertEquals(13.284434142115,st.getDev(numSet), 0.005 );
    }

}
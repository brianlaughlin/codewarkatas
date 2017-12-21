package kata.swapparisinarray;

public class Swappairs {
    public Object[][][] swapp(Object[][] inp) {
        final Object[][] outp = new Object[inp.length][2];
        for (int i = 0; i < inp.length; i++) {
            outp[i][0] = inp[i][1];
            outp[i][1] = inp[i][0];
        }
        return new Object[][][] {inp, outp};
    }

    public Object[][][] swapp2(Object[][] inp) {
        Object[][] out = new Object[inp.length][2];
        for(int i = 0 ; i < inp.length ; i++){
            out[i][0] = inp[i][1];
            out[i][1] = inp[i][0];
        }
        return new Object[][][] {inp,out};
    }
}

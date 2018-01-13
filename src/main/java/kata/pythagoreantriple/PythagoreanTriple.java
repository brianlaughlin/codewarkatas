package kata.pythagoreantriple;

public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){
        int a, b, c;

        a = triple[0];
        b = triple[1];
        c = triple[2];

        if(c * c == a * a + b * b) return 1;
        else return 0;

    }
}

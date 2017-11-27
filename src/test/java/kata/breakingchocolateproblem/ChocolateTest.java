package kata.breakingchocolateproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChocolateTest {
    @Test
    public void myTests() {
        assertEquals(Chocolate.breakChocolate(5, 5) , 24);
        assertEquals(Chocolate.breakChocolate(1, 1) , 0);
    }

    @Test
    public void noChocolate(){
        assertEquals("What if I told you there was no chocolate?",0,
                            Chocolate.breakChocolate(0,0));
    }

    @Test
    public void myTestsBest() {
        assertEquals(Chocolate.breakChocolateBest(5, 5) , 24);
        assertEquals(Chocolate.breakChocolateBest(1, 1) , 0);
        assertEquals("What if I told you there was no chocolate?",0,
                Chocolate.breakChocolateBest(0,0));
    }
}
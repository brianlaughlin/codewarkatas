package kata.kyu8.howoldwillibein2099;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgeDiffTest {
    AgeDiff age = new AgeDiff();

    @Test
    public void bornThisYear(){
        assertEquals("You were born this very year!", age.CalculateAge(2018, 2018));
    }

    @Test
    public void bornDate(){
        assertEquals("You are 4 years old.", age.CalculateAge(2012, 2016));
    }

    @Test
    public void oneYearOld(){
        assertEquals("You are 1 year old.", age.CalculateAge(2011, 2012));
    }

    @Test
    public void testAge() {

        assertEquals("You are 4 years old.", age.CalculateAge(2012, 2016));
        assertEquals("You are 27 years old.", age.CalculateAge(1989, 2016));
        assertEquals("You are 90 years old.", age.CalculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", age.CalculateAge(2000, 1990));
        assertEquals("You were born this very year!", age.CalculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", age.CalculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", age.CalculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", age.CalculateAge(2010, 1500));
        assertEquals("You are 1 year old.", age.CalculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", age.CalculateAge(2000, 1999));

    }
}
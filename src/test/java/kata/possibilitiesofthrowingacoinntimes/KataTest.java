package kata.possibilitiesofthrowingacoinntimes;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void testKata() throws Exception {

        Kata kata = new Kata();

        String[]  s = kata.Simple.coin(2);
        for(String c: s){
            System.out.print(c);
        }


    }





}
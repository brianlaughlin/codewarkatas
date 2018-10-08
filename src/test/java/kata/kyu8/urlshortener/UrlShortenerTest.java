package kata.kyu8.urlshortener;

import org.junit.Test;

import java.util.Random;

import static org.testng.Assert.*;

public class UrlShortenerTest {

    @Test
    public void testBase62(){
        assertEquals("a", UrlShortener.base62(0));
    }


    @Test
    public void testBase62No2(){
        assertEquals("b", UrlShortener.base62(1));
    }

    @Test
    public void RandomeTest(){
        Random r = new Random();
        for(int i = 0; i < 200; i++){
            int n = r.nextInt(100000000) + 1;
            System.out.println(
                   n + " = " + UrlShortener.base62(n)
            );
        }
    }

}
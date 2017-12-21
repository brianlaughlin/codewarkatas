package kata.swapparisinarray;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class SwappairsTest {
    @Test
    public void test1(){
        Swappairs testS = new Swappairs();
        Integer[][] test1={{0,0},{1,1}};
        Integer[][][] sol1={{{0,0},{1,1}},{{0,0},{1,1}}};
        assertEquals("Test1:",sol1,testS.swapp(test1));



    }

    @Test
    public void test2(){
        Swappairs testS = new Swappairs();


        Integer[][] test2={{1,0},{0,1}};
        Integer[][][] sol2={{{1,0},{0,1}},{{0,1},{1,0}}};
        assertEquals("Test2:",sol2,testS.swapp(test2));

    }

    @Test
    public void test3(){
        Swappairs testS = new Swappairs();


        String[][] test3={{"aa","bb"},{"abc","def"}};
        String[][][] sol3={{{"aa","bb"},{"abc","def"}},{{"bb","aa"},{"def","abc"}}};
        assertEquals("Test3:",sol3,testS.swapp(test3));
    }

}
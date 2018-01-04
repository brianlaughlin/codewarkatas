package kata.directionreduction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirReductionTest {
    @Test
    public void testSimpleDirReduc() throws Exception {
        assertEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

    }

    @Test
    public void simpleTest(){

        assertEquals(new String[]{"NORTH"}, DirReduction.dirReduc(new String[]{"NORTH", "NORTH", "SOUTH"}));
    }

    @Test
    public void Test1(){
        assertEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
                new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                DirReduction.dirReduc3(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
    }


}
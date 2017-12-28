package kata.wasdmovement;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GameInputTest {

    private float oneOverSqrt2 = (float)(1/Math.sqrt(2));

    @Test
    public void test1(){
        List<Combination> combinations = new ArrayList<>();
        combinations.add(new Combination("W", new boolean[] {true, false, false, false}, new float[]{0,1f}));

//        assertArrayEquals(new float[]{0, 1f}, new boolean[] {true, false, false, false});
//
//        assertArrayEquals(new boolean[]{true, false, false, false});


    }

    @Test
    public void totalInputsTest()
    {

        List<Combination> combinations = new ArrayList<>();
        combinations.add(new Combination("None", new boolean[] {false, false, false, false}, new float[]{0,0}));
        combinations.add(new Combination("W", new boolean[] {true, false, false, false}, new float[]{0,1f}));
        combinations.add(new Combination("A", new boolean[] {false, true, false, false}, new float[]{-1f,0}));
        combinations.add(new Combination("S",  new boolean[] {false, false, true, false}, new float[]{0,-1f}));
        combinations.add(new Combination("AS", new boolean[] {false, true, true, false}, new float[]{-oneOverSqrt2,-oneOverSqrt2}));
        combinations.add(new Combination("AD", new boolean[] {false, true, false, true}, new float[]{0,0}));
        combinations.add(new Combination("SD", new boolean[] {false, false, true, true}, new float[]{oneOverSqrt2,-oneOverSqrt2}));
        combinations.add(new Combination("ASD", new boolean[] {false, true, true, true}, new float[]{0,-1f}));
        combinations.add(new Combination("WASD", new boolean[] {true, true, true, true}, new float[]{0,0}));

        Collections.shuffle(combinations);

        GameInput gameInput = new GameInput();


        for(Combination eachCombination : combinations)
        {
            float[] actual = gameInput.getVector(eachCombination.wasd);
            assertTrue("Input " + eachCombination.name + " Expected " + Arrays.toString(eachCombination.vector) + " Actual " + Arrays.toString(actual), Arrays.equals(actual, eachCombination.vector));
        }

    }

    class Combination
    {

        public String name;
        public float[] vector;
        public boolean[] wasd;

        public Combination(String name, boolean[] wasd, float[] vector)
        {
            this.name = name;
            this.wasd = wasd;
            this.vector = vector;
        }
    }
}
package kata.wasdmovement;

public class GameInput {
    public float[] getVector(boolean[] wasd)
    {
        float oneOverSqrt2 = (float)(1/Math.sqrt(2));

        float[] vector = new float[2];
        if(wasd[0] == true) vector[1] += 1; //w
        if(wasd[2] == true) vector[1] += -1; //s

        if(wasd[1] == true) vector[0] += -1; //a
        if(wasd[3] == true) vector[0] += 1; //d

        // AS Combo
        if(wasd[1] && (wasd[2]) && !wasd[0] & !wasd[3]) {
            vector[0] = -oneOverSqrt2;
            vector[1] = -oneOverSqrt2;
        }

        // AW Combo
        if(wasd[1] && (wasd[0]) && !wasd[2] & !wasd[3]) {
            vector[0] = -oneOverSqrt2;
            vector[1] = oneOverSqrt2;
        }

        // SD Combo
        if(wasd[2] && (wasd[3]) && !wasd[1] & !wasd[0]) {
            vector[0] = oneOverSqrt2;
            vector[1] = -oneOverSqrt2;
        }

        // WD Combo
        if(wasd[0] && (wasd[3]) && !wasd[2] & !wasd[1]) {
            vector[0] = oneOverSqrt2;
            vector[1] = oneOverSqrt2;
        }


        return vector;
    }

    public static float[] getVectorShortest(boolean[] wasd) {
        final float
                x = (wasd[3] ? 1 : 0) - (wasd[1] ? 1 : 0),
                y = (wasd[0] ? 1 : 0) - (wasd[2] ? 1 : 0),
                m = x == 0 || y == 0 ? 1 : (float)(Math.sqrt(2) / 2);
        return new float[]{x * m, y * m};
    }
}

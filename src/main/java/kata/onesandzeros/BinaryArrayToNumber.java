package kata.onesandzeros;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String binaryString = "";
        for(int i=0; i<binary.size(); i++){
            binaryString += Integer.toString(binary.get(i));
        }

        return Integer.parseInt(binaryString, 2);
    }
}

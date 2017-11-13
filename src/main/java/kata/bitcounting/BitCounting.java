package kata.bitcounting;

public class BitCounting {

    public static int countBits(int n) {
        String binary = Integer.toBinaryString(n);

        int num = 0;
        char bin[] = binary.toCharArray();
        for(int i = 0; i < binary.length(); i++){
            if(bin[i] == 49) num++;
        }
        return num;

    }

    public static int countBitsShort(int n){

        return Integer.bitCount(n);
    }
}

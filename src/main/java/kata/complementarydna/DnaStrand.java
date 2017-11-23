package kata.complementarydna;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/complementary-dna/train/java

 */
public class DnaStrand {
    public static String makeComplement(String dna) {

        StringBuilder newDna = new StringBuilder();
        for(int i=0; i < dna.length(); i++){
            switch(dna.charAt(i)){
                case 'A': newDna.append("T");
                    break;
                case 'T': newDna.append("A");
                    break;
                case 'G': newDna.append("C");
                    break;
                case 'C': newDna.append("G");
                    break;
            }
        }
        return newDna.toString();
    }

    /*
    Used a place holder so you won't overwrite the 1st change.
     */
    public static String makeComplementUsingReplace(String dna) {
        dna = dna.replaceAll("A","Z");
        dna = dna.replaceAll("T","A");
        dna = dna.replaceAll("Z","T");
        dna = dna.replaceAll("C","Z");
        dna = dna.replaceAll("G","C");
        dna = dna.replaceAll("Z","G");
        return dna;
    }

    /*
    Using a stream
     */

    private static Map<Character, String> DNAMap = new HashMap<>();

    static {
        DNAMap.put('A', "T");
        DNAMap.put('T', "A");
        DNAMap.put('C', "G");
        DNAMap.put('G', "C");
    }

    public static String makeComplementStream(String dna) {
        return dna
                .chars()
                .mapToObj(val -> DNAMap.get((char)val))
                .collect(Collectors.joining(""));
    }
}
package kata.complementarydna;

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
}
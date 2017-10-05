package kata.jadencasing;

public class JadenCase2 {
    public String toJadenCase(String phrase){
        if(phrase == null || phrase.isEmpty()) return null;

        char[] array = phrase.toCharArray();

        for(int x =0; x < array.length; x++){
            if(x==0 || array[x-1] == ' '){
                array[x] = Character.toUpperCase(array[x]);
            }
        }
        return new String(array);
    }
}

package kata.isitanumber;

public class MyUtilities {
    public boolean isDigit(String s)
    {
        s = s.trim();
        try{
            Double d = Double.parseDouble(s);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}

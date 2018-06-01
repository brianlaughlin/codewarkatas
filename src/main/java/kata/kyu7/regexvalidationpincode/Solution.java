package kata.kyu7.regexvalidationpincode;

public class Solution {
    public static boolean validatePin(String pin) {
        if(pin.length() == 4 || pin.length() == 6){
            return pin.matches("\\d+");
        }
        return false;
    }

    public static boolean validatePinRegOnly(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

}
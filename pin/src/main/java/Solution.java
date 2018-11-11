public class Solution {

    public static boolean validatePin(String pin) {
        if(pin == null) {
            return false;
        }

        return pin.matches("\\d{4}|\\d{6}");
    }

}
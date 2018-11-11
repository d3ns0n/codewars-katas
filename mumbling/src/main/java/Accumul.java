import java.util.Collections;

public class Accumul {

    public static String accum(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int length = s.length();
        String[] parts = new String[length];
        for (int i = 1; i <= length; i++) {
            String sequence = String.join("", Collections.nCopies(i, s.substring(i - 1, i)));
            parts[i-1] = sequence.substring(0,1).toUpperCase() + sequence.substring(1).toLowerCase();
        }

        return String.join("-", parts);
    }

}

import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word) {
        String lowerCase = word.toLowerCase();

        return lowerCase.chars()
            .mapToObj(letter -> lowerCase.indexOf(letter) == lowerCase.lastIndexOf(letter) ? "(" : ")")
            .collect(Collectors.joining());

    }

}

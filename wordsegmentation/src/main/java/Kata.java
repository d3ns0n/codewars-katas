import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static String[] maxMatch(String sentence) {
        List<String> result = new ArrayList<>();

        while (sentence.length() > 0) {
            String next = getNext(sentence);
            result.add(next);
            sentence = sentence.substring(next.length());
        }

        return result.toArray(new String[0]);
    }

    private static String getNext(String sentence) {
        return Preloaded.VALID_WORDS.stream()
            .sorted((o1, o2) -> o2.length() - o1.length())
            .filter(sentence::startsWith)
            .findFirst()
            .orElse(sentence.substring(0, 1));
    }

}

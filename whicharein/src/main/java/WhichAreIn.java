import java.util.stream.Stream;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        return Stream.of(array1)
            .filter(s1 -> Stream.of(array2).anyMatch(s2 -> s2.contains(s1)))
            .distinct()
            .sorted()
            .toArray(String[]::new);
    }

}

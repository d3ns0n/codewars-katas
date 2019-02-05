public class Line {

    public static String WhoIsNext(String[] names, int n) {
        while (n > names.length) {
            n = (n - (names.length - 1)) / 2;
        }

        return names[n - 1];
    }

}

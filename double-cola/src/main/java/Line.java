public class Line {

    public static String WhoIsNext(String[] names, int n) {
        int round = 0;
        int queueMultiplier = 1;
        int queueSize = names.length;
        int cansLeft = n;

        while (queueSize < cansLeft) {
            round++;
            cansLeft = cansLeft - queueSize;
            queueMultiplier = calculateQueueMultiplier(round);
            queueSize = names.length * queueMultiplier;
        }

        return names[calculateIndex(queueMultiplier, cansLeft)];
    }

    private static int calculateQueueMultiplier(int round) {
        return (int) Math.pow(2, round);
    }

    private static int calculateIndex(int queueMultiplier, int cansLeft) {
        return Math.toIntExact((cansLeft - 1) / queueMultiplier);
    }

}

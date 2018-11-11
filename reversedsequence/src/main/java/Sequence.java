public class Sequence {

    public static int[] reverse(int n){
        int[] sequence = new int[n];
        for(int i = n; i >= 1; i--) {
            sequence[n-i] = i;
        }

        return sequence;
    }

}

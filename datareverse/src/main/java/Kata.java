import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static int[] DataReverse(int[] data) {
        int byteSize = 8;
        int numberOfBytes = data.length / byteSize;
        List<int[]> bytes = new ArrayList<>();
        for (int i = 0; i < numberOfBytes; i++) {
            bytes.add(0, Arrays.copyOfRange(data, i * byteSize, i * byteSize + byteSize));
        }

        return bytes.stream()
            .map(Arrays::stream)
            .flatMapToInt(intStream -> intStream)
            .toArray();
    }

}

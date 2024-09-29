import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static List<Long> compressedNums(double[] arr) {
        return Arrays.stream(arr)
                .filter(num -> num != 0)
                .mapToObj(Math::round)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(compressedNums(new double[]{1.6, 0, 212.3, 34.8, 0, 27.5})); // ➞ [1, 27, 34, 212]
    }
}
import java.util.Arrays;

public class Task7 {
    public static int secondBiggest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        System.out.println(secondBiggest(new int[]{3, 5, 8, 1, 2, 4})); // ➞ 5
    }
}
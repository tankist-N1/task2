import java.util.Arrays;

public class Task4 {
    public static double[] normalizator(double[] arr) {
        double min = Arrays.stream(arr).min().getAsDouble();
        double max = Arrays.stream(arr).max().getAsDouble();
        double[] normalized = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            normalized[i] = (arr[i] - min) / (max - min);
        }
        return normalized;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(normalizator(new double[]{3.5, 7.0, 1.5, 9.0, 5.5}))); // ➞ [0.3333, 0.8333, 0.0, 1.0, 0.6667]
        System.out.println(Arrays.toString(normalizator(new double[]{10.0, 10.0, 10.0, 10.0}))); // ➞ [0.0, 0.0, 0.0, 0.0]
    }
}
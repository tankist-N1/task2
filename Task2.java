public class Task2 {
    public static int dividedByThree(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0 && num % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(dividedByThree(new int[]{3, 12, 7, 81, 52})); // ➞ 2
    }
}
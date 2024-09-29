public class Task9 {
    public static int equal(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;
        } else if (a == b || b == c || a == c) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(equal(8, 1, 8)); // ➞ 2
        System.out.println(equal(5, 5, 5)); // ➞ 3
        System.out.println(equal(4, 9, 6)); // ➞ 0
    }
}
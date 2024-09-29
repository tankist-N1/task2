import java.util.Arrays;

public class Task10 {
    public static boolean isAnagram(String str1, String str2) {
        char[] chars1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] chars2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("LISTEN", "silent")); // ➞ true
        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!")); // ➞ true
        System.out.println(isAnagram("hello", "world")); // ➞ false
    }
}
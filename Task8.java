public class Task8 {
    public static String localReverse(String str, char marker) {
        StringBuilder result = new StringBuilder();
        int start = 0;
        while (start < str.length()) {
            int end = str.indexOf(marker, start + 1);
            if (end == -1) {
                result.append(str.substring(start));
                break;
            }
            result.append(str, start, str.indexOf(marker, start + 1))
                    .append(new StringBuilder(str.substring(str.indexOf(marker, start + 1), end + 1)).reverse());
            start = end + 1;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(localReverse("baobab", 'b')); // ➞ "baboab"
        System.out.println(localReverse("Hello, I’m under the water, please help me", 'e')); // ➞ " Hednu m’I ,oller thetaw er, plesae hem ple"
    }
}
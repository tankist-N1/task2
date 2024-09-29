public class Task6 {
    public static String camelToSnake(String camelCase) {
        return camelCase.replaceAll("([A-Z])", "_$1").toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(camelToSnake("helloWorld")); // ➞ "hello_world"
    }
}
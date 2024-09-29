public class Task3 {
    public static String getInitials(String fullName) {
        String[] parts = fullName.split(" ");
        String initials = parts[1].substring(0, 1).toUpperCase() + "." +
                          parts[2].substring(0, 1).toUpperCase() + ".";
        return initials + parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1);
    }

    public static void main(String[] args) {
        System.out.println(getInitials("simonov sergei evgenievich")); // ➞ "S.E.Simonov"
        System.out.println(getInitials("kozhevnikova tatiana vitalevna")); // ➞ "T.V. Kozhevnikova"
    }
}
public class q4set6 {
    public static boolean isOnlyDigits(String s) {

        if (s == null || s.isEmpty()) return false;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isOnlyDigits("12345")); // true
        System.out.println(isOnlyDigits("12a45")); // false
    }
}

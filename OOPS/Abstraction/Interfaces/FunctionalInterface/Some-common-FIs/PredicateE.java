public class PredicateE {
    public static void main(String[] args) {
        // Example usage of Predicate functional interface
        java.util.function.Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false
    }
}
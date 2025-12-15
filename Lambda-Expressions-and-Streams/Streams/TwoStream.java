public class TwoStream {
    public static void main(String[] args) {
        java.util.List<String> list = java.util.Arrays.asList("apple", "banana", "cherry", "date");
        list.stream()
            .filter(fruit -> fruit.startsWith("b"))
            .forEach(System.out::println);
    }
}
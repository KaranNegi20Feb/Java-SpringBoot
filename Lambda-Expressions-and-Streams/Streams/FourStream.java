import java.util.*;
import java.util.stream.*;  
public class FourStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

         // Using reduce to concatenate names       
        String result = names.stream().reduce("", (a, b) -> a + b + " ");
        System.out.println(result.trim());
    }
}
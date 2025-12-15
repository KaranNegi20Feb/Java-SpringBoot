import java.util.*;

public class OneStream {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>(
            Arrays.asList(1,2,3,4,5,6,7,8,9,10)
        );

        l1.stream()
          .filter(n -> n % 2 == 0)
          .forEach(System.out::println);
    }
}

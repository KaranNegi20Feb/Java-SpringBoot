import java.util.*;
import java.util.stream.*;

public class ThreeStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,8,17,14,1,2,3,4,5);

        List<Integer> evenSquareList =
        list.stream()
            .filter(n -> n % 2 == 0)   // condition
            .map(n -> n * n)
            .collect(Collectors.toList());

        System.out.println(evenSquareList);

        List<Integer> sortedList =
                list.stream()
                    .sorted()
                    .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}

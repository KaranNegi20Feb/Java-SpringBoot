import java.util.*;

public class q2set2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.remove(5); // removes element at index 5 (which is 6)

        int midIndex = list.size() / 2;
        System.out.println(list.get(midIndex)); // 3
    }
}

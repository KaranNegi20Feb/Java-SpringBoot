import java.util.*;

public class q3set6 {
    public static void main(String[] args) {

        String str = "programming";
        str = str.toLowerCase();

        HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }

        System.out.println(sb); // programing
    }
}

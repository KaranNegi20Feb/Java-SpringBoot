import java.util.*;

public class q3set5 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int n = arr.length + 1; // since one number is missing

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for(int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;

        System.out.println(missing);
    }
}

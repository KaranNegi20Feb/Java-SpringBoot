import java.util.*;

public class TwoExample {
    public static void main(String[] args) {
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age: ");
        age= sc.nextInt();

        try {
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above");
            }
            System.out.println("Eligible");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

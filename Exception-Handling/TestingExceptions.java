import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class TestingExceptions{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.print("Enter a age");
        age=sc.nextInt();
        try{
            if(age<18){
                throw new InvalidAgeException("The age is not appropriate to vote.");
            }
            else{
                System.out.println("You can vote.");
            }
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
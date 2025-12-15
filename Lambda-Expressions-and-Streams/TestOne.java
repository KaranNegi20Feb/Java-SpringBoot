interface Subtraction{
    int subtraction(int a,int b);
}
public class TestOne{
    public static void main(String[] args){
        Subtraction sub = (a,b) -> a-b;
        int result=sub.subtraction(20,10);
        System.out.println("subtraction: "+result);
    }
}
interface Add {
    int addition(int a, int b);
}

public class LambdaTwo {
    public static void main(String[] args) {
        Add add = Math::addExact;
        System.out.println(add.addition(10, 20));
    }
}

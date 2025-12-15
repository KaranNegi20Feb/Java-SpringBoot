@FunctionalInterface
interface myclass{
    void run();
    default void walk() {
        System.out.println("Walking");
    }
    static void info() {
        System.out.println("Info");
    }
}
public class FunctionalInterfaceE implements myclass{
    public void run(){
            System.out.println("hello");
    }
    public static void main(String[] args) {
        FunctionalInterfaceE f1= new FunctionalInterfaceE();
        f1.run();
        f1.walk(); // calling default method
        myclass.info(); // calling static method
    }
}
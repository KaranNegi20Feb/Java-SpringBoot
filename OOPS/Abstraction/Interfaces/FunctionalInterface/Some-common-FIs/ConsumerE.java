public class ConsumerE{
    public static void main(String []args){
        java.util.function.Consumer<String> print = s -> System.out.println(s);
        print.accept("Java"); // Java 
        // System.out.println(print.accept("Java")); --- IGNORE --- 
        // this will give error as accept() returns void
    }
}
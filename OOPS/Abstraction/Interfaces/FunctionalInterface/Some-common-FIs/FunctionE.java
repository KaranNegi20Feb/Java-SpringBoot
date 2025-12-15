public class FunctionE{
    public static void main(String []args){
        java.util.function.Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("Java")); // 4
    }
}
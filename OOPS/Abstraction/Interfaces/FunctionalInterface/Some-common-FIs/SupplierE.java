public class SupplierE{
    public static void main(String []args){
        java.util.function.Supplier<Double> randomValue = () -> Math.random()*31;
        System.out.println(randomValue.get()); // prints a random value between 0.0 and 1.0
        //does not take any input but returns a value
    }
}
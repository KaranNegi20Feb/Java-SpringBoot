public class CallableE{
    public static void main(String []args){
        java.util.concurrent.Callable<Integer> task = () -> {
            int sum = 0;
            for(int i=1;i<=5;i++){
                sum += i;
            }
            return sum;
        };
        try {
            System.out.println("Sum: " + task.call()); // Sum: 15
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Callable can return a value and can throw checked exceptions
    }
}   
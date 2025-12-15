public class RunnableE{
    public static void main(String []args){
        Runnable r = () -> {
            for(int i=1;i<=5;i++){
                System.out.println("Thread "+i+" is running");
            }
        };
        Thread t = new Thread(r);
        t.start();
        // Runnable does not take any input and does not return any value
    }
}
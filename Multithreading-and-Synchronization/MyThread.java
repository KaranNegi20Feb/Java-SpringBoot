// Sleeping the Custom Thread
import java.lang.Thread;

// Class extending the Thread Class
public class MyThread extends Thread 
{
    // Overriding the run method
    @Override
    public void run()
    {
        // use throws keyword followed by exception
      	// name for throwing the exception
        try {
            for (int i = 0; i < 5; i++) {
              
                // method will sleep the thread
                Thread.sleep(-1000);
              
                // printing the value of the variable
                System.out.print(i+" ");
            }
        }
        catch (Exception e) {
            // catching the exception
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        // created thread
        MyThread obj = new MyThread();
        obj.start();
    }
}
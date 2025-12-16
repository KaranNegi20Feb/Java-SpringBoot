// Sleeping the main thread
import java.io.*;
import java.lang.Thread;

class SleepDemo 
{
    public static void main(String[] args)
    {
        // we use throws keyword followed by exception
      	// name for throwing the exception
        try {
            for (int i = 0; i < 5; i++) {
              
                // sleep the main thread for 1 sec
                // for every loop runs
                Thread.sleep(1000,999999);
              
                // printing the value of the variable
                System.out.print(i+" ");
            }
        }
        catch (Exception e) {
            // catching the exception
            System.out.println(e.getMessage());
        }
    }
}
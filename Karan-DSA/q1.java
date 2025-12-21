import java.util.*;
public class q1{
    public static void main(String []args){
        int []arr={1,2,3,4,5};
        int t=1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[i]*t;
            if(i!=n-1){
                arr[i]=arr[i]*arr[i+1];
            }
            t=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);        
        }
    }
}

---ai code ------
import java.util.*;

public class q1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int prev = 1;   // previous element

        for (int i = 0; i < n; i++) {
            int curr = arr[i];          // store current
            int next = (i == n - 1) ? 1 : arr[i + 1];

            arr[i] = prev * next;       // replace

            prev = curr;                // update prev
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

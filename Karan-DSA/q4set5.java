import java.util.*;

public class q4set5{
    public static void custom_reverse2(int []arr, int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public static void main(String []args){
        int k=2;
        int []arr={1,2,3,4,5,6};
        // [6 5 4 3 2 1]
        // [3 4 5 6 2 1]
        // [3 4 5 6 1 2]
        custom_reverse2(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
        }
        custom_reverse2(arr,0,arr.length-k-1);
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
        }
        custom_reverse2(arr,arr.length-k,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);   
        }
    }
}
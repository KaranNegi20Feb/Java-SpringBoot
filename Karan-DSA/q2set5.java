import java.util.*;

public class q2set5{
    public static int findKlargest(int[]arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            while(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
    public static void main(String []args){
        int []arr={1,4,6,3,7,8};
        int k=3;
        System.out.println(findKlargest(arr,k));
    }
}
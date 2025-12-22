import java.util.*;

public class q4set2{
    public static void main(String []args){
        int []arr1={1,3,5,7};
        int []arr2={2,4,6,8,9,10};
        ArrayList<Integer>res=new ArrayList<>();
        int i=0,j=0;
        while(i!=arr1.length && j!=arr2.length){
            if(arr1[i]<=arr2[j]){
                res.add(arr1[i]);
                i++;
            }
            else{
                res.add(arr2[j]);
                j++;
            }
        }
        while(i!=arr1.length){
            res.add(arr1[i]);
            i++;
        }
        while(j!=arr2.length){
            res.add(arr2[j]);
            j++;    
        }
        System.out.println(res);
    }
}
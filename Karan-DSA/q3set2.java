import java.util.*;

public class q3set2{
    public static void main(String []args){
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1,9,7,2,3,4,5,5,2,3,4,5));
        HashMap<Integer,Integer>mpp= new HashMap<>();
        for(int i=0;i<arr.size();i++){
            int e=arr.get(i);
            mpp.put(e,mpp.getOrDefault(e,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int it : mpp.keySet()){
            if (mpp.get(it) == 1){
                ans.add(it);
            }
        }
        System.out.println(ans);

    }
}
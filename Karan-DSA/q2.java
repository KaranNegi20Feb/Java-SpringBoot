import java.util.*;
public class q2{
    public static void main(String []args){
        int []arr={1,2,3,4,2,4,5,5,6,7};
        int ans=0;
        //1+2+3+4+3+2+3+
        //
        int n=arr.length;
        int l=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int r=0;r<n;r++){
            mpp.put(arr[r],mpp.getOrDefault(arr[r],0)+1);
            while(mpp.get(arr[r])>1){
                mpp.put(arr[l],mpp.get(arr[l])-1);
                l++;
            }
            ans+=r-l+1;
        }
        System.out.println(ans);

    }
}
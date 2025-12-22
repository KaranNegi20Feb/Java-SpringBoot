import java.util.*;

public class q5set3{
    public static void main(String []args){
        String s="aabcdeiidfaadfsgajah";
        HashMap<Character,Integer>mpp=new HashMap<>();
        for(char c:s.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                mpp.put(c,mpp.getOrDefault(c,0)+1);
            }
        }
        System.out.println(mpp);
    }
}
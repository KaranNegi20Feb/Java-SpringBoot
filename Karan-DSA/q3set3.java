import java.util.*;

public class q3set3{
    public static void main(String []args){
        String s1="karan";
        String s2="nakkar";
        HashMap<Character,Integer>mpp=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            Character c= s1.charAt(i);
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s2.length();i++){
            Character c= s2.charAt(i);
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }

        for(char i:mpp.keySet()){
            if(mpp.get(i)%2!=0){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");

    }
}
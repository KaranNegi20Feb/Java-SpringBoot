import java.util.HashMap;
public class q2set6{
    public static void main(String []args){
        String str="Swiss";
        str=str.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c: str.toCharArray()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }
        // Another Approach

        String s = "swiss".toLowerCase();
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                System.out.println(c);
                break;
            }
        }



    }
}
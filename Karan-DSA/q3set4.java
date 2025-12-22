import java.util.*;

public class q3set4{
    public static void main(String[]args){
        String sen="I am karan and i am here to conquer the world";
        sen = sen.toLowerCase();
        String[] words = sen.split("\\s+");
        //Split the sentence wherever there are one or more spaces
        //. \\s is white space \\s+ one or more spaces
        HashMap<String, Integer> mpp = new HashMap<>();

        for (String word : words) {
            mpp.put(word, mpp.getOrDefault(word, 0) + 1);
        }

        System.out.println(mpp);
    }
}
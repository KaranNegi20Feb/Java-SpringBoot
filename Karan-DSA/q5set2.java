import java.util.*;
// integer to string String s= String.valueOf(num);
// string to integer int num=Integer.parseInt(s); 
public class q5set2{
    public static boolean checkPalindrome(int num){
        String s = String.valueOf(num);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String []args){
        int num=12234221;
        System.out.println(checkPalindrome(num)?"Yes":"No");
    }
}
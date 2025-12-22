public class q1set4{
    public static String reverseString(String s){
        StringBuffer temp=new StringBuffer("");
        for(int i=s.length()-1;i>=0;i--){
            temp.append(s.charAt(i));
        }
        return temp.toString();
    }
    public static void main(String []args){
        String s="karan";
        System.out.println(reverseString(s));
    }
}
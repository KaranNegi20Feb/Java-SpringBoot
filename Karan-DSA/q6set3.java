public class q6set3{
    public static int fact(int num){
        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String []args){
        int num=3;
        int ans=fact(num);
        System.out.println(ans);
    }
}
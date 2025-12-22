public class q4set3{
    public static void main(String []args){
        int num=123456;
        int temp=0;
        while(num!=0){
            int t=num%10;
            temp=temp*10+t;
            num=num/10;
        }
        System.out.println(temp);
    }
}
public class q4{
    public static boolean checkPrime(int n){
        if (n == 1 || n == 0) {
            return false;  
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String []args){
        int []arr={1,2,21,7,4,3,9};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=checkPrime(arr[i])?arr[i]:0;
        }
        System.out.println(ans);

    }
}
public class q3{
    public static boolean checkComposite(int n){
        if (n <= 3) {
            return false;   // 1,2,3 are not composite
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;

    }
    public static void main(String []args){
        int []arr={1,2,21,7,4,3,9};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=checkComposite(arr[i])?arr[i]:0;
        }
        System.out.println(ans);

    }
}
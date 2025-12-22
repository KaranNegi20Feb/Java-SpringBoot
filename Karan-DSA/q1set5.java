public class q1set5{
    public static void main(String []args){
        int []arr={0,0,1,0,3,12};//{1 0 0 0 3 12}
        int n=arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
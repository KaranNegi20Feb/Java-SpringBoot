public class q1set6{
    public static void main(String[]args){
        String str="Hello World from Karan";
        String []words=str.split("\\s+");
        for(int i=0;i<words.length;i++){
            StringBuffer sb= new StringBuffer(words[i]);
            sb.reverse();
            words[i]=sb.toString();
        }
        String result=String.join(" ",words);
        System.out.println(result);

    }
}
public class q2set3{
    public static void main(String []args){
        String str="aabbccdddd";
        StringBuffer res= new StringBuffer();
        int i=0;
        while(i<str.length()){
            res.append(str.charAt(i));
            int occ=1;
            while(i+1<str.length() && str.charAt(i+1)==str.charAt(i)){
                occ++;
                i++;
            }
            res.append(Integer.toString(occ));
            i++;
        }
        System.out.println(res.toString());
    }
}
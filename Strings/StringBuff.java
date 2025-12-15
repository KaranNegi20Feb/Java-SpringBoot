public class StringBuff{
    public static void main(String []args){
        StringBuffer sb=new StringBuffer("Hello");
        //append
        sb.append(" World");
        System.out.println(sb); //Hello World
        //insert
        sb.insert(5, ",");
        System.out.println(sb); //Hello, World
        //replace
        sb.replace(6, 11, "Java");
        System.out.println(sb); //Hello, Java
        //delete i to j-1
        sb.delete(5, 6);
        System.out.println(sb); //Hello Java
        //reverse
        sb.reverse();
        System.out.println(sb); //avaJ olleH
        //length
        System.out.println(sb.length()); //10
        //toString
        String str = sb.toString();
        System.out.println(str); //avaJ olleH
    }
}
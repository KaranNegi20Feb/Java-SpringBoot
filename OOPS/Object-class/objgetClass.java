class person{
    String name;
    public person(String s){
        this.name=s;
    }
}
public class objgetClass{
    public static void main(String []arg){
        person p1=new person("negi");
        Class o=p1.getClass();
        System.out.println(o.getName());
        //person
    }
}
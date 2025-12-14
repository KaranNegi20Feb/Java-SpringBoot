class person{
    String name;
    public person(String s){
        this.name=s;
    }
    @Override
    public String toString(){
        return "Name: " + name;
    }
}
public class objclass{
    public static void main(String []args){
        person p1=new person("Karan");
        System.out.println(p1.toString());
        //person@1dbd16a6
    }
}
class person {
    String name;

    public person(String s){
        this.name = s;
    }

    @Override
    public int hashCode(){
        return name.hashCode();   // CORRECT
    }
}

public class objhashcode{
    public static void main(String []args){
        person p1=new person("Karan");
        System.out.println(p1.hashCode());
        //72266473
    }
}
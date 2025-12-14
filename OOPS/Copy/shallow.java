class Address{
    String city;
    public Address(String s){
        this.city=s;
    }
}
public class shallow{
    public static void main(String []args){
        Address a1= new Address("ddun");
        Address a2= a1; // <-- shallow copy shared by both a1 and a2
        a2.city="mum";
        System.out.println(a1.city);
    }
}
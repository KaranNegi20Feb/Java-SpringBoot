class Address{
    String city;

    public Address(String s){
        this.city = s;
    }

    // copy constructor
    public Address(Address a){
        this.city = a.city;
    }
}

public class deep{
    public static void main(String []args){
        Address a1 = new Address("ddun");
        Address a2 = new Address(a1);  // deep copy

        a2.city = "mum";
        System.out.println(a1.city);
    }
}

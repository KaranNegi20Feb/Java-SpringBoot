class Person implements Cloneable {
    int age;

    Person(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}
//❌ Without Cloneable → CloneNotSupportedException

public class CloneableE {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person(25);
        Person p2 = (Person) p1.clone();

        System.out.println(p1.age); // 25
        System.out.println(p2.age); // 25
    }
}

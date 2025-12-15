import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
//✅ Implements Serializable → Object can be serialized
public class SerializableE {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Karan");
        System.out.println("Student ID: " + s1.id); // Student ID: 1
        System.out.println("Student Name: " + s1.name); // Student Name: Karan
    }
}
//❌ Without Serializable → NotSerializableException
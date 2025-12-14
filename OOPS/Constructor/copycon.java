class Student{
    int id;
    String name;
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public Student(Student s){
        id=s.id;
        name=s.name;
    }
}
public class copycon{
    public static void main(String []args){
        Student s1=new Student(101,"John");
        Student s2=new Student(s1);
        System.out.println(s2.id+" "+s2.name);
    }
}
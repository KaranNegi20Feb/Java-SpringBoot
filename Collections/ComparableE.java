class Student implements Comparable<Student> {
    int id;
    Student(int id){ this.id = id; }

    public int compareTo(Student s){
        return this.id - s.id; // sort by id
    }
}

List<Student> list = new ArrayList<>();
list.add(new Student(3));
list.add(new Student(1));
Collections.sort(list); // uses compareTo

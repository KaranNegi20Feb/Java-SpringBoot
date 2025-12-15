// Example of using Comparator with lambda expression
List<Student> list = new ArrayList<>();
list.add(new Student(3));
list.add(new Student(1));

Collections.sort(list, (s1, s2) -> s1.id - s2.id); // custom sorting
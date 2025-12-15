List<String> list = new ArrayList<>();
list.add("Java");
list.add("Go");

Iterator<String> it = list.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}

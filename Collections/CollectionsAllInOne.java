import java.util.*;

public class CollectionsAllInOne {
    public static void main(String[] args) {

        /* 1️⃣ ArrayList */
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Go");
        arrayList.add("Java"); // duplicates allowed
        System.out.println("ArrayList: " + arrayList);

        /* 2️⃣ LinkedList */
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(5);
        System.out.println("LinkedList: " + linkedList);

        /* 3️⃣ HashSet */
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("A"); // no duplicates
        System.out.println("HashSet: " + hashSet);

        /* 4️⃣ LinkedHashSet */
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("A");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        /* 5️⃣ TreeSet */
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println("TreeSet: " + treeSet);

        /* 6️⃣ HashMap */
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Go");
        hashMap.put(1, "Python"); // key overwritten
        System.out.println("HashMap: " + hashMap);

        /* 7️⃣ LinkedHashMap */
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "Go");
        linkedHashMap.put(3, "Python");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        /* 8️⃣ TreeMap */
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "C");
        treeMap.put(1, "Java");
        treeMap.put(2, "Go");
        System.out.println("TreeMap: " + treeMap);

        /* 9️⃣ Queue (PriorityQueue) */
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Poll from Queue: " + pq.poll());

        /* 🔟 Stack */
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Go");
        stack.push("Python");
        System.out.println("Stack: " + stack);
        System.out.println("Pop from Stack: " + stack.pop());
    }
}

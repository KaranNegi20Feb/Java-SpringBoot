class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next = null;
    }
}
public class q2set2p2 {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        // slow fast pointer
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}

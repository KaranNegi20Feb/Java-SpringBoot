class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class q1set3{
    public static void insertLinkedList(Node head,int data){
        Node it=head;
        while(it.next!=null){
            it=it.next;
        }
        it.next=new Node(data);
    }

    public static void printlist(Node head){
        Node it=head;
        while(it!=null){
            System.out.println(it.data);
            it=it.next;
        }
        System.out.println("-----");
    }

    public static void removeLinkedList(Node head, int t){
        Node it=head;
        while(it.next.data!=t){
            it=it.next;
        }
        it.next=it.next.next;
    }

    public static void detectLoop(Node head){
        Node slow=head;
        Node fast=head;
        int flag=0;
        while(fast!=null && flag==0){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)flag=1;
        }
        System.out.println(flag==0? "No":"Yes");
    }


    public static void main(String []args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        //Insert - 4
        insertLinkedList(head,4);
        //print linked list
        printlist(head);
        //remove element
        removeLinkedList(head,2);
        //remove element
        printlist(head);
        insertLinkedList(head,5);
        //loop added
        head.next.next.next= head.next;
        //above adds a loop
        detectLoop(head);
    }

}
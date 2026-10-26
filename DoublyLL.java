class Node{
    int data;
    Node next,prev;
    Node(int data){
        this.data=data;
    }
}
public class DoublyLL {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node second=new Node(20);
        Node tail=new Node(30);
        head.next=second;
        second.next=tail;
        tail.next=null;
        head.prev=null;
        second.prev=head;
        tail.prev=second;
        dis1(head);
        System.out.println();
        dis2(tail);
    }
    public static void dis1(Node head){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" --> ");
            n=n.next;
        }
    }
    public static void dis2(Node tail){
        Node n=tail;
        while(n!=null){
            System.out.print(n.data+" --> ");
            n=n.prev;
        }
    }
}

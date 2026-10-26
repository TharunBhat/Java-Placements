class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class CircularLL{
    public static void main(String[] args) {
        Node head=new Node(10);
        Node second=new Node(20);
        Node tail=new Node(30);
        head.next=second;
        second.next=tail;
        tail.next=head;
        dis(head);
    }
    public static void dis(Node head){
        Node n=head;
        do{
            System.out.print(n.data+" --> ");
            n=n.next;
        }while(n!=head);
    }
}
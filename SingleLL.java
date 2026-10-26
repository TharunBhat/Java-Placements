class Node{
    String data;
    Node Next;
}
public class SingleLL {
    public static void main(String[] args){
        Node head=new Node();
        Node second=new Node();
        Node tail=new Node();
        head.data="A";
        second.data="B";
        tail.data="C";
        head.Next=second;
        second.Next=tail;   
        tail.Next=null;
        Node m=head;
        while(m!=null){
            System.out.print(m.data);
            if(m.Next!=null){
                System.out.print(" --> ");
            }
            m=m.Next;
        }
    }
}

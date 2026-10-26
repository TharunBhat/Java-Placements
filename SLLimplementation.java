class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class SLL{
    Node head;
    Node tail;
    SLL(){
        head=null;
        tail=null;
    }
    public void insert(int data){
        Node hello=new Node(data);
        if(head==null){
            head=hello;
            tail=hello;
        } else {
            tail.next=hello;
            tail=hello;
        }
    }
    public void search(int val){
        int p=0;
        Node n=head;
        while(n!=null){
            if(n.data==val){
                p=1;break;
            }
            n=n.next;
        }
        if(p==1)
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
    public void del(int tar){
        if(head.data==tar){
            head=head.next;
        }
        else{
            Node n=head;
            while(n.next.data!=tar){
                n=n.next;
            }
            n.next=n.next.next;
        }
    }
    public void dis(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data);
            if(n.next!=null){
                System.out.print(" --> ");
            }
            n=n.next;
        }
    }
}
public class SLLimplementation {
    public static void main(String[] args){
        SLL o=new SLL();
        o.insert(10);
        o.insert(20);
        o.insert(30);
        o.insert(40);
        o.insert(50);
        o.dis();
        System.out.println();
        o.search(30);
        o.del(10);
        o.dis();
    }
}

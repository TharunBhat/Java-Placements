class Node6
{
    Node6 prev;
    int data;
    Node6 next;
    Node6(int d)
    {
        this.data = d;
    }
}

class DLL{
    Node6 head;
    Node6 tail;
    DLL()
    {
        head = tail = null;
    }
    public void insert(int data) {
        Node6 hello = new Node6(data);
        if (head == null) {
            head = hello;
            tail = hello;
        } else {
            tail.next = hello;
            hello.prev = tail;
            tail = hello;
        }
    }
    public void display()
    {
        Node6 n = head;
        while(n != null)
        {
            System.out.print(n.data+"->");
            n=n.next;

        }
        System.out.println();
    }
    public void display2()
    {
        Node6 n = tail;
        while(n != null)
        {
            System.out.print(n.data+"->");
            n=n.prev;

        }
        System.out.println();
    }
    public boolean search(int tar)
    {
        Node6 n = head;
        while(n != null) {
            if (n.data == tar) {
                return true;
            }
            n = n.next;
        }
            return false;

    }


public void delete(int tar){
    if(head.data==tar){
        head=head.next;
        head.prev=null;
    }
    else if(tail.data==tar){
        tail=tail.prev;
        tail.next=null;
    }
    else{
        Node6 n=head;
        while(n.next!=null&&n.next.data!=tar){
            n=n.next;
        }
        if(n.next!=null){
            n.next=n.next.next;
            if(n.next!=null){
                n.next.prev=n;
            }
        }

    }
}
}
public class Doublysearch {
    public static void main(String[] args)
    {
        DLL o = new DLL();
        int[] arr = {10,20,30,40};
        for(int i = 0 ;i < arr.length ; i++)
        {
            o.insert(arr[i]);
        }
        o.display(); o.display2();
        System.out.println(o.search(40));
        o.delete(30);
        o.display(); o.display2();
    }
}

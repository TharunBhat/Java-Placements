public class StackLL {
    public static void main(String[] args){
        StackLL1 s = new StackLL1();

        s.push(10);
        s.push(20);
        s.push(30);
        s.dis();
        s.peek();
        s.pop();
        s.dis();
        s.pop();
        s.pop();
        s.pop();
        s.dis();
    }
}

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class StackLL1 {
    Node top;

    StackLL1(){
        top = null;
    }

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed");
    }

    void dis(){
        if(top == null){
            System.out.println("Empty Stack");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void peek(){
        if(top == null){
            System.out.println("Empty Stack");
        } else {
            System.out.println(top.data);
        }
    }

    void pop(){
        if(top == null){
            System.out.println("Underflow");
        } else {
            top = top.next;
            System.out.println("Popped");
        }
    }
}

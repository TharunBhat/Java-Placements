public class QueueLL {
    public static void main(String[] args){
        QueueLL1 q = new QueueLL1();

        q.push(10);
        q.push(20);
        q.push(30);
        q.dis();
        q.peek();
        q.pop();
        q.dis();
        q.pop();
        q.pop();
        q.pop();
        q.dis();
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

class QueueLL1 {
    Node front, rear;

    QueueLL1(){
        front = rear = null;
    }

    void push(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Pushed");
    }

    void dis(){
        if(front == null){
            System.out.println("Empty Queue");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void peek(){
        if(front == null){
            System.out.println("Empty Queue");
        } else {
            System.out.println(front.data);
        }
    }

    void pop(){
        if(front == null){
            System.out.println("Underflow");
            return;
        }
        front = front.next;

        if(front == null){
            rear = null;
        }

        System.out.println("Popped");
    }
}

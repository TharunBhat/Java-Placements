class Node6 {
    Node6 prev;
    int data;
    Node6 next;

    Node6(int d) {
        this.data = d;
    }
}

class DLL {
    Node6 head;
    Node6 tail;

    DLL() {
        head = tail = null;
    }

    public void insert(int data) {
        Node6 hello = new Node6(data);

        if (head == null) {
            head = tail = hello;
            head.next = head;
            head.prev = head;
        } else {
            hello.prev = tail;
            hello.next = head;
            tail.next = hello;
            head.prev = hello;
            tail = hello;
        }
    }

    public void display() {
        if (head == null) return;

        Node6 n = head;
        do {
            System.out.print(n.data + "->");
            n = n.next;
        } while (n != head);

        System.out.println();
    }

    public void display2() {
        if (tail == null) return;

        Node6 n = tail;
        do {
            System.out.print(n.data + "->");
            n = n.prev;
        } while (n != tail);

        System.out.println();
    }

    public boolean search(int tar) {
        if (head == null) return false;

        Node6 n = head;
        do {
            if (n.data == tar) return true;
            n = n.next;
        } while (n != head);

        return false;
    }

    public void delete(int tar) {
        if (head == null) return;

        if (head == tail && head.data == tar) {
            head = tail = null;
            return;
        }

        if (head.data == tar) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            return;
        }

        if (tail.data == tar) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            return;
        }

        Node6 n = head.next;
        while (n != head) {
            if (n.data == tar) {
                n.prev.next = n.next;
                n.next.prev = n.prev;
                return;
            }
            n = n.next;
        }
    }
}

public class Doublycircular {
    public static void main(String[] args) {
        DLL o = new DLL();
        int[] arr = {10, 20, 30, 40};

        for (int x : arr) {
            o.insert(x);
        }

        o.display();
        o.display2();
        System.out.println(o.search(40));

        o.delete(30);
        o.display();
        o.display2();
    }
}

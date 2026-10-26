import java.util.LinkedList;
import java.util.Queue;

public class Program9 {
    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<>();
        s.add(5);s.add(3);s.add(6);
        s.add(2);s.add(1);s.add(4);
        s.remove();
        System.out.println(s);
        System.out.println(s.peek());
    }
}

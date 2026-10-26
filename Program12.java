import java.util.ArrayDeque;
import java.util.Queue;
public class Program12 {
    public static void main(String[] args) {
        Queue<Integer> s = new ArrayDeque<>();
        s.add(1);s.add(2);s.add(3);
        s.remove();
        System.out.println(s);
        System.out.println(s.peek());
    }
}

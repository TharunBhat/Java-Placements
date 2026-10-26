import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumbers{

    public static void main(String[] args) {

        int n = 3;

        Queue<String> q = new LinkedList<String>();
        q.add("1");

        for(int i = 1; i <= n; i++) {

            String s = q.remove();
            System.out.print(s + " ");

            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
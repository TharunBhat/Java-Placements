import java.util.LinkedList;
import java.util.Queue;
public class QueueInteger {
    static Queue<Integer> qu1 = new LinkedList<>();
    static Queue<Integer> qu2 = new LinkedList<>();
    public static void insert(int a){
        while(!qu1.isEmpty()){
            qu2.add(qu1.poll());
        }
        qu1.add(a);
        while(!qu2.isEmpty()){
            qu1.add(qu2.poll());
        }
    }
    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        while(!qu1.isEmpty()){
            System.out.println(qu1.poll()+" ");
        }
    }
}

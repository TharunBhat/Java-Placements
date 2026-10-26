import java.util.ArrayList;
import java.util.List;

public class Program10 {
    public static void main(String[] args){
    List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(0);
        l.add(0,100);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.get(0));
        System.out.println(l.set(1,111));
        System.out.println(l.isEmpty());
        System.out.println(l);
}
}

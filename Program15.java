//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Program15 {
    public static void main(String[] args) {
        Map <Integer, String> s = new TreeMap<>();
        s.put(1, "c");
        s.put(0, "c++");
        s.put(5, "java");
        s.put(-1, "python");
        System.out.println(s);
    }
}

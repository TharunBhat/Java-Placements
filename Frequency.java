import java.util.*;
public class Frequency{
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("English",90);
        map.put("Maths",80);
        map.put("Science",85);
        System.out.println(map);
        System.out.println(map.containsValue(0));
        System.out.println(map.containsKey("English"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
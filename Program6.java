public class Program6 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("hello");
        s.append("123");
        System.out.println(s);
        s.replace(5,7,"77");
        System.out.println(s);
        s.delete(5,8);
        System.out.println(s);
    }
}

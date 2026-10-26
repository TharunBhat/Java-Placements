import java.util.Scanner;
public class Antakshari {
    public static void main(String args[]){
    Scanner in =new Scanner(System.in);
    String cur="",prev="",stop="####";
    do{
        cur=in.nextLine();
        if(prev.isEmpty()||cur.charAt(0)==prev.charAt(prev.length()-1)){
            System.out.println(cur);
        }
        prev=cur;
    }while(!cur.equals(stop));
}
}
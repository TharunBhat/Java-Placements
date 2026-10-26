public class Program26 {
    public static void main(String[] args) {
        int a=0,b=1;
            call(a,b,1);
        }
public static void call(int a,int b,int n){
        if(n==11){
            return;
        }else{
            System.out.println(a);
            call(b,a+b,n+1);
        }
    }
}

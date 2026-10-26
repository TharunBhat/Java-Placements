public class Program17 {
    public static void main(String[] args){
        int res=f(5);
        System.out.println(res);
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }
        else{
        return n*f(n-1);
        }
    }
}

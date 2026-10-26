public class Program27 {
    public static void main(String[] args) {
        dis(0,1,0,0);
    }
    public static void dis(int a,int b,int c,int count){
        if(count==6){
            return;
        }
        else{
            System.out.println(a);
            c=a+b;
            dis(b,c,c,count+1);
        }
    }
}

public class Program16 {
    public static void main(String[] args){
        dis(1);
    }
    public static void dis(int n){
        if(n>10){
            return;
        }
        else{
            System.out.println("Tharun");
            dis(n+1);
        }
    }
}

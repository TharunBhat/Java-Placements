    import java.util.Scanner;
    public class ArrayInput {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }
            int loc=sc.nextInt();
            if(loc<1||loc>n){
                System.out.println("Invalid Input");
                sc.close();                return;
            }
            int val=sc.nextInt();
            for(int i=n;i>=loc-1;i--){
                arr[i+1]=arr[i];
            }
            arr[loc-1]=val;
            for(int i=0;i<=n+1;i++){
                System.out.print(arr[i]+" ");
            }
            sc.close();
        }
        
    }
    

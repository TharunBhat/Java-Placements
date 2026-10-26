import java.util.*;
public class dynamicarray {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element "+i+" index :");
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
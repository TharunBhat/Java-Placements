import java.util.*;
public class BigO{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int tar=10;
        for(int i=0;i<arr.length;i++){
            if(tar==arr[i]){
                System.out.println("Yes");
            }
                else{
                    System.out.println("No");
                }
        }
    }
}

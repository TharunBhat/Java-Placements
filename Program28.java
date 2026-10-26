public class Program28 {
    public static void main(String[] args) {
        int num=123;
        int dummy=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println(dummy);
        if(dummy==rev)
        System.out.println("yes");
        else  
        System.out.println("no"); 
    }
        System.out.print(rev);
        if(num==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}

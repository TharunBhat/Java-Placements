//Sum of odd numbers from 1 to 10
// public class Program24 {
//     public static void main(String[] args) {
//         System.out.println(call(1, 10, 0));
//     }
//     public static int call(int s,int e,int sum){
//         if(s==e+1)
//             return sum;
//             else{
//                 if(s%2!=0){
//                     sum=sum+s;
//                 }
//                 return call(s+1,e,sum);
//             }
//     }
// }


//Sum of even numbers from 1 to 10
public class Program24 {
    public static void main(String[] args) {
        System.out.println(call(1, 10, 0));
    }
    public static int call(int s,int e,int sum){
        if(s==e+1)
            return sum;
            else{
                if(s%2==0){
                    sum=sum+s;
                }
                return call(s+1,e,sum);
            }
    }
}

public class Program7 {
    public static void main(String[] args) {
//       for(int i=1;i<=250;i++){
//            System.out.println(i);
//        }
//     double a=5.0;
//     int b=(int)a;
//     System.out.println(b);

        String x= "Mister 123";
        int c=0;
        int l=0;
        int sp=0;
        int d=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)>=65 && x.charAt(i)<=90){
                c++;
            }
            else if(x.charAt(i)>=97 && x.charAt(i)<=122){
                l++;
            }
            else if(x.charAt(i)==32){
                sp++;
            }
            else if(x.charAt(i)>=48 && x.charAt(i)<=57){
                d++;
            }
        }
        System.out.println("capital letter : "+c);
        System.out.println("lowercase letter : "+l);
        System.out.println("space : "+sp);
        System.out.println("digits : "+d);
     
    }
}
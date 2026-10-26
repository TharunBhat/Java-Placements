public class Stack {
    public static void main(String[] args){
        int size=3;
        Stack1 s=new Stack1(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.dis();
        s.peek();
        s.pop();
        s.dis();
        s.pop();
        s.pop();
        s.pop();
        s.dis();
    }
}
class Stack1{
    int arr[];
    int top;
    Stack1(int size){
        arr=new int[size];
        top=-1;
    }
    void push(int data){
        if(top==arr.length-1){
            System.out.println("Overflow");
        }
        else{
            arr[++top]=data;
            System.out.println("Pushed");
        }
    }
    public void dis(){
        if(top==-1){
            System.out.println("Empty Stack");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]);
            }
        }
    }
    public void peek(){
        if(top==-1){
            System.out.println("Empty Stack");
        }
        else{
            System.out.println(arr[top]);
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            top--;
            System.out.println("Popped");
        }
    }
}

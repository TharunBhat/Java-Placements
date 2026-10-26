public class Queue {
    public static void main(String[] args){
        int size=3;
        Queue1 q=new Queue1(3);
        q.push(10);
        q.push(20);
        q.push(30);
        q.dis();
        q.peek();
        q.pop();
        q.dis();
        q.pop();
        q.pop();
        q.pop();
        q.dis();
    }
}
class Queue1{
    int arr[];
    int top;
    Queue1(int size){
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
            System.out.println("Empty Queue");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]);
            }
        }
    }
    public void peek(){
        if(top==-1){
            System.out.println("Empty Queue");
        }
        else{
            System.out.println(arr[0]);
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            top--;
            System.out.println("Popped");
        }
    }
}

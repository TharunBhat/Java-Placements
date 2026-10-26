import java.util.Stack;
public class StackCharacter {
        static Stack<Integer> stk1= new Stack<>();
        static Stack<Integer> stk2 = new Stack<>();
        public static void insert(int a){
            while(!stk1.isEmpty()){
                stk2.push(stk1.pop());
            }
            stk1.push(a);
            while(!stk2.isEmpty()){
                stk1.push(stk2.pop());
            }
        }
        public static void main(String[] args) {
            insert(1);
            insert(2);
            insert(3);
            while(!stk1.isEmpty()){
                System.out.println(stk1.pop());
            }
        }
    }
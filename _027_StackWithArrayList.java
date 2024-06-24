import java.util.ArrayList;

public class _027_StackWithArrayList {
    static class Stack {
         ArrayList<Integer> list = new ArrayList<>();
 
        public  void push(int data){
            list.add(data);
        }
        public  int peek (){
            return list.get(list.size()-1);
        }
        public  void pop(){
            list.remove(list.size()-1);
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}

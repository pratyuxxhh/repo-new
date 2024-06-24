import java.util.Stack;

public class _028_pushAtBottom {

    public static void pushAtBottom(int x , Stack<Integer> s ){
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int dummy = s.peek();
        s.pop();
        pushAtBottom(x, s);
        s.push(dummy);
    }
    public static void reverse ( Stack<Integer> s ){
        if (s.isEmpty()) {
            return;
        }
        int dummy = s. peek();
        s.pop();
        reverse(s);
        pushAtBottom(dummy ,s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

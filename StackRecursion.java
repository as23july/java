import java.util.Stack;

public class StackRecursion {

    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        // s.push(4);

        pushAtBottom(4, s);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

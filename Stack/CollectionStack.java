import java.util.Stack;

public class CollectionStack {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

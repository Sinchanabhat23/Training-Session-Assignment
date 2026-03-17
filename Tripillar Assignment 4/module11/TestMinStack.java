
// LeetCode 155 – Min Stack

package module11;
import java.util.Stack;
class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
    void pop() {
        int val = stack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
    }
    int top() {
        return stack.peek();
    }
    int getMin() {
        return minStack.peek();
    }
}
public class TestMinStack {
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(5);
        s.push(2);
        s.push(8);
        System.out.println(s.getMin());
    }
}
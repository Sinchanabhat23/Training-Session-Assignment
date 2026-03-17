
//LeetCode 232 – Implement Queue using Stacks

package module11;
import java.util.Stack;

class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int x) {
        s1.push(x);
    }

    int pop() {

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        int val = s2.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return val;
    }
}

public class TestQueue {

    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.pop());
    }
}

// LeetCode 150 – Evaluate Reverse Polish Notation

package module11;
import java.util.Stack;

public class RPN {

    static int solve(String[] arr) {

        Stack<Integer> st = new Stack<>();

        for (String s : arr) {

            if (s.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }

            else if (s.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }

            else if (s.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }

            else if (s.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }

            else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {

        String[] arr = {"2", "1", "+", "3", "*"};

        System.out.println(solve(arr));
    }
}
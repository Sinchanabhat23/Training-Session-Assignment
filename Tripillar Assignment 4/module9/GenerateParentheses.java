
// LeetCode 22 – Generate Parentheses

package module9;
public class GenerateParentheses {
        public static void generate(int open, int close, String s) {
            if (open == 0 && close == 0) {
                System.out.println(s);
                return;
            }
            if (open > 0)
                generate(open - 1, close, s + "(");
            if (close > open)
                generate(open, close - 1, s + ")");
        }
        public static void main(String[] args) {
            int n = 3;
            generate(n, n, "");
        }
    }

import java.util.*;

class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(-1); // marker
            } else {
                if (stack.peek() == -1) {
                    stack.pop();
                    stack.push(1); // "()"
                } else {
                    int sum = 0;
                    while (stack.peek() != -1) {
                        sum += stack.pop();
                    }
                    stack.pop(); // remove -1
                    stack.push(2 * sum);
                }
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
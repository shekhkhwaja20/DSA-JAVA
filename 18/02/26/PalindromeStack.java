// wap which will check the given stack is palindrome or not 
import java.util.Stack;

public class PalindromeStack {

    public static boolean isPalindrome(Stack<Integer> st) {
        
        Stack<Integer> temp = new Stack<>();
        
        // Copy stack
        temp.addAll(st);
        
        Stack<Integer> reversed = new Stack<>();
        
        // Reverse stack
        while (!temp.isEmpty()) {
            reversed.push(temp.pop());
        }
        
        // Compare original and reversed
        return st.equals(reversed);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(1);
        st.push(2);
        st.push(1);
        st.push(2);
        st.push(1);

        if (isPalindrome(st)) {
            System.out.println("Palindrome Stack");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
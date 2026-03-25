import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        Stack<Integer> temp = new Stack<>();

        // Remove elements greater than target
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (top <= target) {
                temp.push(top);
            }
        }

        // Restore original order
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println("Final Stack: " + stack);
    }
}
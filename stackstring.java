import java.util.Scanner;
import java.util.Stack;

public class stackstring {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string=");
    String str =sc.nextLine();

    Stack<Character> stack= new Stack<>();
    // step 1.push all the characters in the stack 
    for(int i=0;i<str.length();i++)
    {
        stack.push(str.charAt(i));
    }
    // step2. pop and reverse the given string 
    String reversed = " ";
    while(!stack.isEmpty())
    {
           reversed +=stack.pop();
    }
    System.out.println("Reversed String="+reversed);
   }
}

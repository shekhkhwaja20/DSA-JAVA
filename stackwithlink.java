class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;  // head of linked list

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed");
    }

    // Pop operation
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek operation
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Check if empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class stackwithlink{
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped: " + s.pop());
        System.out.println("Top: " + s.peek());

        s.display();
    }
}
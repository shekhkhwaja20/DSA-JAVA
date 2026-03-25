class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    Node head;

    // 🔹 Insert at Start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 🔹 Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // 🔹 Insert at Position
    public void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 🔹 Delete at Start
    public void deleteAtStart() {
        if (head == null) return;
        head = head.next;
    }

    // 🔹 Delete at End
    public void deleteAtEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // 🔹 Delete at Position
    public void deleteAtPosition(int pos) {
        if (head == null) return;

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // 🔹 Search Element
    public int search(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // 🔹 Delete by Value
    public void deleteElement(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // 🔹 Find Middle
    public int getMiddle() {
        if (head == null) return -1;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // 🔹 Reverse List
    public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // 🔹 Detect Cycle
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // 🔹 Print List
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 🔥 MAIN METHOD (Testing)
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtStart(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(25, 2);

        list.printList(); // 10 -> 20 -> 25 -> 30 -> null

        list.deleteAtPosition(2);
        list.printList();

        System.out.println("Search 20: " + list.search(20));

        System.out.println("Middle: " + list.getMiddle());

        list.reverse();
        list.printList();
    }
}
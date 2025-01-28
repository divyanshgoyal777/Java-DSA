class Stack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;

    boolean isEmpty() {
        return top == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; 
        top = newNode;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackDS {
    public static void main(String args[]) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
    }
}

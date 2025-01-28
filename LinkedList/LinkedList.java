class LL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    void delete() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        head = head.next;
    }

    int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LinkedList {
    public static void main(String args[]) {
        LL list = new LL();
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.print();
        list.delete();
        list.print();
        System.out.println(list.size());
    }
}
import java.util.*;

public class BinarySearchTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int value) {
            this.data = value;
            this.left = this.right = null;
        }
    }

    Node root;

    public Node insert(Node node, int value) {
        if (node == null)
            return new Node(value);

        if (value < node.data)
            node.left = insert(node.left, value);
        else if (value > node.data)
            node.right = insert(node.right, value);

        return node;
    }

    public boolean search(Node node, int value) {
        if (node == null)
            return false;
        if (node.data == value)
            return true;

        return value < node.data ? search(node.left, value) : search(node.right, value);
    }

    public void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public int findMin(Node node) {
        if (node == null)
            throw new NoSuchElementException("Tree is empty");

        while (node.left != null)
            node = node.left;

        return node.data;
    }

    public int findMax(Node node) {
        if (node == null)
            throw new NoSuchElementException("Tree is empty");

        while (node.right != null)
            node = node.right;

        return node.data;
    }

    public Node delete(Node node, int key) {
        if (node == null)
            return null;

        if (key < node.data)
            node.left = delete(node.left, key);
        else if (key > node.data)
            node.right = delete(node.right, key);
        else {
            // Node with 1 or no child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            // Node with 2 children: get inorder successor
            node.data = findMin(node.right);
            node.right = delete(node.right, node.data);
        }

        return node;
    }

    public int height(Node node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public void bfs(Node node) {
        if (node == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.offer(current.left);
            if (current.right != null)
                queue.offer(current.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = { 50, 30, 70, 20, 40, 60, 80 };
        for (int val : values)
            bst.root = bst.insert(bst.root, val);

        System.out.print("In-order Traversal: ");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.print("Pre-order Traversal: ");
        bst.preOrder(bst.root);
        System.out.println();

        System.out.print("Post-order Traversal: ");
        bst.postOrder(bst.root);
        System.out.println();

        System.out.print("BFS Traversal: ");
        bst.bfs(bst.root);
        System.out.println();

        System.out.println("Min Value: " + bst.findMin(bst.root));
        System.out.println("Max Value: " + bst.findMax(bst.root));
        System.out.println("Height of tree: " + bst.height(bst.root));
        System.out.println("Search 40: " + bst.search(bst.root, 40));
        System.out.println("Search 100: " + bst.search(bst.root, 100));

        bst.root = bst.delete(bst.root, 30);
        System.out.print("In-order after deleting 30: ");
        bst.inOrder(bst.root);
        System.out.println();
    }
}

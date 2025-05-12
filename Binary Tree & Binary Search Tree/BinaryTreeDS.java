import java.util.*;

public class BinaryTreeDS {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public BinaryTreeDS(int data) {
        root = new Node(data);
    }

    public void inOrderTraversal(Node node) {
        if (node == null)
            return;

        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public void preOrderTraversal(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {
        if (node == null)
            return;

        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public int height(Node node) {
        if (node == null)
            return 0;

        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int diameter(Node node) {
        if (node == null)
            return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int leftDiameter = diameter(node.left);
        int rightDiameter = diameter(node.right);

        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    public int depth(Node node, int target) {
        if (node == null)
            return -1;
        if (node.data == target)
            return 0;

        int left = depth(node.left, target);
        int right = depth(node.right, target);

        if (left != -1)
            return left + 1;
        if (right != -1)
            return right + 1;

        return -1;
    }

    public void bfs(Node node) {
        if (node == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeDS tree = new BinaryTreeDS(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Pre-order traversal: ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.print("Post-order traversal: ");
        tree.postOrderTraversal(tree.root);
        System.out.println();

        System.out.print("BFS traversal: ");
        tree.bfs(tree.root);
        System.out.println();

        System.out.println("Height of tree: " + tree.height(tree.root));
        System.out.println("Diameter of tree: " + tree.diameter(tree.root));
        System.out.println("Depth of node with data 5: " + tree.depth(tree.root, 5));
    }
}

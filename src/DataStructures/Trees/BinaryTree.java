package DataStructures.Trees;

import java.util.Scanner;

public class BinaryTree {

    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();

        System.out.println("\nInorder: ");
        inOrder(root);
        System.out.println("\nPreorder: ");
        preOrder(root);
        System.out.println("\nPostorder: ");
        postOrder(root);
    }

    static Node createTree() {
        Node root = null;

        System.out.println("Enter value: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter value for left of " + data);
        root.left = createTree();
        System.out.println("Enter value for right of " + data);
        root.right = createTree();

        return root;
    }

    // LNR
    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    // NLR
    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // LRN
    static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}

package binaryTree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// import java.util.Stack;

public class BinaryTreeCreation {

    // Nested static class to represent each node in the binary tree.
    // Each node contains an integer value, and references to left and right child nodes.
    static class Node {
        int root;         // Value of the node
        Node left, right; // References to left and right child nodes

        // Constructor to initialize the node with data and set left and right children to null.
        Node(int data) {
            root = data;
            left = right = null;
        }
    }

    // Method to create a binary tree based on user input.
    // This method is recursive and prompts the user to enter values for each node.
    // It returns the root node of the created binary tree.
    static Node createBinaryTree(Scanner scanner) {
        System.out.println("Enter the value for node or -1 for null: ");
        int root = scanner.nextInt();

        // If the user enters -1, the current node will be null (no node).
        if (root == -1) {
            return null;
        }

        // Create a new node with the given value.
        Node node = new Node(root);

        // Recursively create the left child.
        System.out.println("Enter the value for left node: " + root);
        node.left = createBinaryTree(scanner);

        // Recursively create the right child.
        System.out.println("Enter the value for right node: " + root);
        node.right = createBinaryTree(scanner);

        return node;
    }

    // In-order DFS traversal method.
    // Traverses the tree in the order: Left Child -> Parent Node -> Right Child.
    // Prints the nodes in in-order sequence.
    static void inOrderDFS(Node node) {
        if (node == null) return;
        inOrderDFS(node.left); // Traverse left subtree
        System.out.println(node.root + " "); // Print current node's value
        inOrderDFS(node.right); // Traverse right subtree
    }

    // Pre-order DFS traversal method.
    // Traverses the tree in the order: Parent Node -> Left Child -> Right Child.
    // Prints the nodes in pre-order sequence.
    static void preOrderDFS(Node node) {
        if (node == null) return;
        System.out.println(node.root + " "); // Print current node's value
        preOrderDFS(node.left); // Traverse left subtree
        preOrderDFS(node.right); // Traverse right subtree
    }

    // Post-order DFS traversal method.
    // Traverses the tree in the order: Left Child -> Right Child -> Parent Node.
    // Prints the nodes in post-order sequence.
    static void postOrderDFS(Node node) {
        if (node == null) return;
        postOrderDFS(node.left); // Traverse left subtree
        postOrderDFS(node.right); // Traverse right subtree
        System.out.println(node.root + " "); // Print current node's value
    }

    // BFS traversal method (Level Order Traversal).
    // Traverses the tree level by level, starting from the root.
    // Uses a queue to keep track of nodes at each level and processes nodes in FIFO order.
    static void levelTraversal(Node node) {
        if (node == null) return;

        Queue<Node> queue = new LinkedList<>(); // Queue to hold nodes for BFS
        queue.add(node); // Start with the root node
        // Stack<Node> stack = new Stack<>();      // Stack to reverse the order


        while (!queue.isEmpty()) {
            Node curNode = queue.poll(); // Dequeue the current node
            System.out.println(curNode.root + " "); // Print current node's value
            // stack.push(curNode);  // Push the node onto the stack
         


            // Enqueue the left child if it exists
            if (curNode.left != null) {
                queue.add(curNode.left);
            }

            // Enqueue the right child if it exists
            if (curNode.right != null) {
                queue.add(curNode.right);
            }
        }

        // Print nodes in reverse level order by popping from the stack
      /*   System.out.println("Reverse Level Order Traversal:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().root + " ");
        } */
    }

    // Main method to run the binary tree creation and traversal.
    // It prompts the user to create a binary tree, then prints the tree using various traversal methods.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the binary tree based on user input
        Node node = createBinaryTree(scanner);

        // Perform and print In-order DFS traversal
        System.out.println("In order traversal");
        inOrderDFS(node);

        // Perform and print Pre-order DFS traversal
        System.out.println("Pre order traversal");
        preOrderDFS(node);

        // Perform and print Post-order DFS traversal
        System.out.println("Post order traversal");
        postOrderDFS(node);

        // Perform and print BFS (Level Order) traversal
        System.out.println("BFS (Level Traversal)");
        levelTraversal(node);
    }
}

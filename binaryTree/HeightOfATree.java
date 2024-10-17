package binaryTree;

/**
 * The HeightOfATree class provides functionality to create a binary tree and determine its height.
 * 
 * The class includes:
 * - An inner static Node class to represent individual nodes in the binary tree.
 * - A main method to create a sample binary tree and calculate its height.
 * - A heightOfTheTree method that recursively calculates the height of the tree.
 * 
 * The height of a binary tree is defined as the number of edges along the longest path from the root node to a leaf node.
 */
public class HeightOfATree {

    /**
     * The Node class represents an individual node in the binary tree.
     * Each node contains an integer data value (root) and two child nodes: left and right.
     */
    static class Node {
        int root; // Holds the data of the node
        Node left, right; // Pointers to the left and right children of the node

        // Constructor to initialize a new node with the given data value
        Node(int data) {
            this.root = data;
            this.left = this.right = null; // Set both child nodes to null initially
        }
    }

    /**
     * The main method is the entry point of the program. It:
     * 1. Creates a sample binary tree with predefined values.
     * 2. Calls the heightOfTheTree method to calculate the height of the tree.
     * 3. Prints the height of the tree.
     */
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node node = new Node(20);
        node.left = new Node(10);
        node.right = new Node(35);
        node.left.left = new Node(5);
        node.left.right = new Node(15);
        node.left.right.left = new Node(13);
        node.left.right.left.right = new Node(10);
        node.right.left = new Node(30);
        node.right.right = new Node(42);

        // Calculate the height of the binary tree
        int height = heightOfTheTree(node);

        // Print the height of the binary tree
        System.out.println("Height of the tree: " + height);
    }

    /**
     * The heightOfTheTree method calculates the height of the binary tree recursively.
     * It:
     * - Checks if the current node is null (base case). If so, it returns 0, as an empty tree has a height of 0.
     * - Recursively calculates the height of the left and right subtrees.
     * - Finds the maximum of the left and right subtree heights and adds 1 (to include the current node).
     * - Returns the calculated height to the caller.
     * 
     * @param node - the current node being processed
     * @return the height of the binary tree from the current node
     */
    private static int heightOfTheTree(Node node) {
        if (node == null) { // Base case: if node is null, return 0
            return 0;
        }

        // Recursively calculate the height of the left and right subtrees
        int leftHeight = heightOfTheTree(node.left);
        int rightHeight = heightOfTheTree(node.right);

        // Determine the larger of the two heights and add 1 for the current node
        int ans = Math.max(leftHeight, rightHeight) + 1;

        return ans; // Return the calculated height
    }
}

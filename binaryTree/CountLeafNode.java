package binaryTree;

import java.util.concurrent.atomic.AtomicInteger;

/* *
 *  In Java, primitive types like int are passed by value, 
 * so when you update count inside the inOrderDFS method, 
 * it does not affect the count variable in the countLeafNode method. As a result, 
 * count always remains zero in the main method.
 */

/**
 * The CountLeafNode class provides functionality to create a binary tree and count the number 
 * of leaf nodes within it. A leaf node is a node with no children (both left and right are null).
 * 
 * This class includes:
 * - An inner static Node class to represent each node of the binary tree.
 * - A main method to construct a sample binary tree and count its leaf nodes.
 * - A countLeafNode method that initiates the leaf node counting.
 * - An inOrderDFS method that traverses the tree in-order and counts leaf nodes.
 * 
 * AtomicInteger is used here to maintain the count across recursive method calls, as it allows
 * passing a mutable integer that is updated directly within the recursive calls.
 */
public class CountLeafNode {
   
    /**
     * The Node class represents an individual node in a binary tree. 
     * Each node contains an integer data (root) and two child nodes: left and right.
     */
    static class Node {
        int root; // Holds the data of the node
        Node right, left; // Pointers to the right and left children of the node

        // Constructor to initialize a new node with a given data value
        Node(int data){
            this.root = data;
            this.left = this.right = null; // Set both child nodes to null initially
        }
    }

    /**
     * The main method is the entry point of the program. It:
     * 1. Creates a sample binary tree with some predefined values.
     * 2. Uses an AtomicInteger to keep track of the count of leaf nodes.
     * 3. Calls countLeafNode to count the leaf nodes in the tree.
     * 4. Prints the count of leaf nodes.
     */
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node node = new Node(20);
        node.left = new Node(10);
        node.right = new Node(35);
        node.left.left = new Node(5);
        node.left.right = new Node(15);
        node.left.right.left = new Node(13);
        node.right.left = new Node(30);
        node.right.right = new Node(42);

        // AtomicInteger to hold the count of leaf nodes
        AtomicInteger count = new AtomicInteger();
        count = countLeafNode(node, count);
        
        // Printing the count of leaf nodes
        System.out.println("Number of leaf nodes: " + count);
    }

    /**
     * This method initializes the counting process by calling the inOrderDFS method 
     * with the root node and the AtomicInteger count. 
     * 
     * @param node - the root node of the binary tree
     * @param count - an AtomicInteger to track the count of leaf nodes
     * @return count - the updated count after traversing the entire tree
     */
    private static AtomicInteger countLeafNode(Node node, AtomicInteger count) {
        inOrderDFS(node, count); // Begin in-order traversal to count leaf nodes
        return count; // Return the count after traversal is complete
    }

    /**
     * The inOrderDFS method performs an in-order depth-first traversal of the tree.
     * It:
     * - Recursively traverses the left subtree.
     * - Checks if the current node is a leaf (i.e., both left and right children are null).
     *   If yes, it increments the count using AtomicInteger.
     * - Recursively traverses the right subtree.
     * 
     * @param node - the current node being processed
     * @param count - an AtomicInteger used to keep track of the number of leaf nodes
     */
    private static void inOrderDFS(Node node, AtomicInteger count) {
        if (node == null) return; // Base case: if the node is null, return
        
        // Traverse the left subtree
        inOrderDFS(node.left, count);

        // If the current node is a leaf node, increment the count
        if (node.left == null && node.right == null) {
            count.incrementAndGet(); // Increment the leaf node count
        }

        // Traverse the right subtree
        inOrderDFS(node.right, count);
    }
}

package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOfNode {

    // Inner class representing a node in the binary tree
    static class InnerLevelOfNode {
        int root; // Value of the node
        InnerLevelOfNode leftLevelOfNode, rigLevelOfNode; // Pointers to left and right children

        // Constructor to initialize the node with a value
        InnerLevelOfNode(int root) {
            this.root = root; // Assign the value to the node
            this.leftLevelOfNode = this.rigLevelOfNode = null; // Initialize children to null
        }
    }

    public static void main(String[] args) {
        // Constructing the binary tree
        InnerLevelOfNode innerLevelOfNode = new InnerLevelOfNode(1);
        innerLevelOfNode.leftLevelOfNode = new InnerLevelOfNode(2);
        innerLevelOfNode.rigLevelOfNode = new InnerLevelOfNode(3);
        innerLevelOfNode.leftLevelOfNode.leftLevelOfNode = new InnerLevelOfNode(4);
        innerLevelOfNode.leftLevelOfNode.rigLevelOfNode = new InnerLevelOfNode(5);
        innerLevelOfNode.rigLevelOfNode.leftLevelOfNode = new InnerLevelOfNode(6); // Fixed to left child
        innerLevelOfNode.rigLevelOfNode.rigLevelOfNode = new InnerLevelOfNode(7);

        int value = 3; // Value to search for in the tree
        int result = LevelTraversal(innerLevelOfNode, value); // Call the method to find the level
        
        // Output the result
        System.err.println(result);
    }

    // Method to find the level of a node in the binary tree
    private static int LevelTraversal(InnerLevelOfNode root, int value) {
        // If the tree is empty, return -1 indicating the node is not found
        if (root == null) return -1;

        // Use a queue to perform level order traversal
        Queue<InnerLevelOfNode> queue = new LinkedList<>();
        queue.add(root); // Start with the root node

        int level = 1; // Start at level 1 (root level)

        // Loop until there are no nodes left to process in the queue
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Get the number of nodes at the current level

            // Iterate through all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                InnerLevelOfNode currNode = queue.poll(); // Remove the front node from the queue

                // Check if the current node's value matches the target value
                if (currNode.root == value) {
                    return level; // Return the current level if the value is found
                }

                // Add left child to the queue if it exists
                if (currNode.leftLevelOfNode != null) {
                    queue.add(currNode.leftLevelOfNode);
                }

                // Add right child to the queue if it exists
                if (currNode.rigLevelOfNode != null) {
                    queue.add(currNode.rigLevelOfNode);
                }
            }

            // Increment the level after processing all nodes at the current level
            level++;
        }

        // If the node with the specified value is not found, return -1
        return -1;
    }
}

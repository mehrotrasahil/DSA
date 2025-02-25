package LinkedList;

public class Creation {

    private Node head;  // This is the head (first node) of the linked list

    // Constructor to initialize the list with an empty head
    public Creation(){
        this.head = null;  // Initially, the list is empty, so head is null
    }
    
    /**
     * Adds a new node to the end of the linked list.
     * @param data The value to be added to the list.
     */
    public void add(int data){
        Node elemNode = new Node(data);  // Create a new node with the given data

        // Case 1: If the list is empty (head is null), set the new node as the head
        if(head == null){
            head = elemNode;
        }else{
            // Case 2: Traverse the list to find the last node and append the new node
            Node currNode = head;  // Start from the head
            while (currNode.next != null) {  // Traverse until you find the last node (where next is null)
                currNode = currNode.next;  // Move to the next node
            }
            currNode.next = elemNode;  // Set the new node as the next of the last node
        }
    }

    /**
     * Adds a new node at the beginning of the linked list.
     * @param data The value to be added at the start of the list.
     */
    public void addFirst(int data){
        Node firstNode = new Node(data);  // Create a new node with the given data
        firstNode.next = head;  // Make the new node point to the current head
        head = firstNode;  // Set the new node as the head of the list
    }

    /**
     * Removes the last node from the linked list.
     * This method assumes that the list has at least two nodes.
     */
    public void removeLast(){
        // Check if the list is empty or has only one element
        if (head == null || head.next == null) {
            head = null;  // If the list is empty or has one node, just set head to null
            return;
        }

        Node currData = head;  // Start from the head
        // Traverse until the second-to-last node (the node before the last)
        while (currData.next.next != null){
            currData = currData.next;  // Move to the next node
        }
        currData.next = null;  // Set the second-to-last node's `next` pointer to null to remove the last node
    }

    /**
     * Removes the first occurrence of a node that contains the specified data.
     * @param data The value to be removed from the list.
     */
    public void remove(int data){
        Node currData = head;  // Start from the head

        // Case 1: If the head contains the data to be removed
        if(currData != null && currData.data == data){
            head = head.next;  // Move the head to the next node, effectively removing the first node
            return;
        }

        Node prevNode = null;  // To keep track of the previous node

        // Traverse the list to find the node that contains the data
        while (currData != null) {
            if(currData.data == data){  // If the current node contains the data to be removed
                prevNode.next = currData.next;  // Unlink the node by updating the previous node's next pointer
                return;
            }
            prevNode = currData;  // Move prevNode to currData
            currData = currData.next;  // Move currData to the next node
        }
    }

    /**
     * Displays the elements of the linked list.
     * Prints each node's data in order, from the head to the last node.
     */
    public void display(){
        Node currNode = head;  // Start from the head

        // Case 1: If the list is empty
        if(currNode == null){
            System.out.println("List is empty");  // Print a message and return
            return;
        }

        // Case 2: Traverse the list and print each node's data
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");  // Print the current node's data
            currNode = currNode.next;  // Move to the next node
        }
        System.out.println("null");  // Print 'null' to indicate the end of the list
    }
}

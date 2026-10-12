/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 */
public class SinglyLinkedList {
    // Instance variable
    private Node head;
    // Constructor
    public SinglyLinkedList() {
        head = null;
    }
    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }
        // Otherwise, traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        // Link the last node to the new node
        current.next = newNode;
    }
    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    // -------------------------------------------------------
    // Find the middle node
    public Node findMiddle() {
        if (head == null) {
            return null;
        }
        // Step 1: Count total number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        // Step 2: Compute middle index using integer division
        int middleIndex = count / 2;
        // Step 3: Traverse to the middle index
        current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }
        return current;
    } // <-- findMiddle ends here
    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {
        // Base case: empty list
        if (head == null) {
            return;
        }
        // Base case: single-node list
        if (head.next == null) {
            head = null;
            return;
        }
        // Step 1: Count total number of nodes
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        // Step 2: Compute middle index
        int middleIndex = count / 2;
        // Step 3: Traverse to the node immediately before the middle node
        Node prev = head;
        for (int i = 0; i < middleIndex - 1; i++) {
            prev = prev.next;
        }
        // Step 4: Bypass and delete the middle node
        prev.next = prev.next.next;
    } // <-- deleteMiddle ends here
    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}

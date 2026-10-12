/**
 * MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 */
public class MiddleNodeDemo {
    public static void main(String[] args) {
        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("List 1:");
        list1.display();
        System.out.println("Middle Node: " + list1.findMiddle().data);
        System.out.println();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        System.out.println("List 2:");
        list2.display();
        System.out.println("Middle Node: " + list2.findMiddle().data);
        System.out.println();
    }
}

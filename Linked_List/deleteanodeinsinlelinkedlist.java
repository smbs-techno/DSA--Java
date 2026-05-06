package Linked_List;


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class deleteanodeinsinlelinkedlist {

    // LeetCode 237 logic
    static void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    // Print list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating list: 4 -> 5 -> 1 -> 9
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(1);
        head.next.next.next = new Node(9);

        System.out.print("Before: ");
        printList(head);

        // Delete node with value 1
        Node nodeToDelete = head.next.next; // node = 1
        deleteNode(nodeToDelete);

        System.out.print("After: ");
        printList(head);
    }
}


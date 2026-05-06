package Linked_List;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class rotatelist {
    static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null)
            return newNode;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        Node temp = head;
        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        k = k % len;
        temp.next = head;
        int steps = len - k;
        Node temp1 = head;
        for (int i = 1; i < steps; i++) {
            temp1 = temp1.next;
        }
        Node newHead = temp1.next;
        temp1.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 1);
        head = insert(head, 2);
        head = insert(head, 3);
        head = insert(head, 4);
        head = insert(head, 5);
        System.out.println("Original Linked List:");
        printList(head);
        int k = 2;
        head = rotateRight(head, k);
        System.out.println("Rotated Linked List:");
        printList(head);
    }
}
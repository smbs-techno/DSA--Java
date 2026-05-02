package Linked_List;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class deleteanodeinsinlelinkedlist {

    // LeetCode 237 logic
    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    // Print list
    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating list: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.print("Before: ");
        printList(head);

        // Delete node with value 1
        ListNode nodeToDelete = head.next.next; // node = 1
        deleteNode(nodeToDelete);

        System.out.print("After: ");
        printList(head);
    }
}


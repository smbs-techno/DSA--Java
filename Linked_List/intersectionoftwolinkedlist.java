package Linked_List;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class intersectionoftwolinkedlist {
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node a = headA;
        Node b = headB;

        while (a != b) {
            if(a==null) a=headB;
            else a=a.next;
            if(b==null) b=headA;
            else b=b.next;
        }

    return a;
    }
    static Node insert(Node head,int val){
        Node newNode=new Node(val);
        if(head==null) return newNode;
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    public static void main(String[] args) {
    Node common = new Node(3);
        common.next = new Node(4);
        common.next.next = new Node(5);

        // list 1
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = common;

        // list 2
        Node head2 = new Node(6);
        head2.next = new Node(7);
        head2.next.next = common;

        Node result = getIntersectionNode(head1, head2);

        if (result != null)
            System.out.println(result.data);
        else
            System.out.println("No intersection");
  }
}

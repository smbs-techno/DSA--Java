package Linked_List;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
 
public class oddevenlinkedlist {
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
 public static Node oddEvenList(Node head) {
    if(head==null) return null;
    Node odd=head;
    Node even=head.next;
    Node evenHead=even;
    while(even != null && even.next!=null){
        odd.next=even.next;
        odd=odd.next;
        even.next=odd.next;
        even=even.next;
    }
    odd.next=evenHead;
    return head;
  }
  static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
  public static void main(String[] args) {
    Node head=null;
    head = insert(head,1);
    head = insert(head,2);
    head = insert(head,3);
    head = insert(head,4);
    head = insert(head,5);
    Node temp=oddEvenList(head);
    printList(temp);
  }
}
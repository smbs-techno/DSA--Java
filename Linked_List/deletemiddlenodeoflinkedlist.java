package Linked_List;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class deletemiddlenodeoflinkedlist {
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
     public static Node deleteMiddle(Node head) {
        if(head==null || head.next==null) return null;
        Node fast=head;
        Node slow=head;
        Node prev=null;
        while(fast != null && fast.next != null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
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
    head = deleteMiddle(head);
    printList(head);
  }
}

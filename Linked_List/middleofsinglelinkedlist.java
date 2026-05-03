package Linked_List;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class middleofsinglelinkedlist {
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
    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    static Node middle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
  
    public static void main(String[] args) {
        Node head=null;
        head=insert(head, 10);
        head=insert(head, 20);
        head=insert(head, 30);
        head=insert(head, 40);
        head=insert(head, 50);
        head=insert(head, 60);
        head=insert(head, 70);
        head=insert(head, 80);
        head=insert(head, 90);
        printList(head);
        System.out.println(middle(head).data);
    }
}

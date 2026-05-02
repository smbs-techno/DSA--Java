package Linked_List;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class deletelastnodeofasinglelinkedlist {
    static Node insert(int val,Node head){
        Node newNode=new Node(val);
        newNode.next=head;
        return newNode;
    } 
    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    static Node deletelast(Node head){
        Node temp=head;
        if(temp==null) return null;
        if(temp.next==null) return null;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head = insert(10, head);
        head = insert(20, head);
        head = insert(30, head);
        head = insert(40, head);
        head=deletelast(head);
        printList(head);
    }
}

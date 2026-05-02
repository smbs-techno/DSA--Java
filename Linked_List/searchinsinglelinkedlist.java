package Linked_List;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class searchinsinglelinkedlist {
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
    static boolean search(Node head,int val){
        if(head==null) return false;
        Node temp=head;
        while(temp!=null){
            if(temp.data==val) return true;
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head, 1);
        head=insert(head, 2);
        head=insert(head, 3);
        head=insert(head, 5);
        head=insert(head, 2);
        System.out.println(search(head, 5));
    }
}

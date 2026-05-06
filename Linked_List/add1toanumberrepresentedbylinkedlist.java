package Linked_List;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class add1toanumberrepresentedbylinkedlist {
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
    static Node add(Node head){
        Node LastNon9=null;
        Node temp=head;
        while (temp != null) {
            if(temp.data != 9){
                LastNon9=temp;
            }
            temp=temp.next;
        }
        if(LastNon9==null){
            Node one=new Node(1);
            one.next=head;
            temp=head;
            while(temp != null){
                temp.data=0;
                temp=temp.next;
            }
            return one;
        }
        else{
            LastNon9.data++;
            temp=LastNon9.next;
            while (temp != null) {
                temp.data=0;
                temp=temp.next;
            }
        }
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
        head=insert(head, 1);
        head=insert(head, 9);
        head=insert(head, 9);
        head=add(head);
        printList(head);
        
    }
}
package Linked_List;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class removenthnodefromendoflinkedlist {
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
    public static Node removeNthFromEnd(Node head, int n) {
        int n1=1;
        Node temp1=head;
        while(temp1.next != null){
            n1++;
            temp1=temp1.next;
        } 
        int m=n1-n;
        if(m==0){
           return head.next;// it is used when to remove the head of a linked list
        }
        else{
            Node temp=head;
            for(int i=1;i<m;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return head;
        }
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
        head=removeNthFromEnd(head,3);
        printList(head);
  }
}

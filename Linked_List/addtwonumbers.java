package Linked_List;

import java.lang.classfile.components.ClassPrinter.ListNode;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class addtwonumbers {
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
        public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy=new Node(-1);
        Node curr=dummy;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node node=new Node(sum%10);
            curr.next=node;
            curr=curr.next;
        }
        return dummy.next;
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
        Node l1 = null;
    l1 = insert(l1, 2);
    l1 = insert(l1, 4);
    l1 = insert(l1, 3);

    Node l2 = null;
    l2 = insert(l2, 5);
    l2 = insert(l2, 6);
    l2 = insert(l2, 4);

    Node result = addTwoNumbers(l1, l2);

    printList(result);
    }

}
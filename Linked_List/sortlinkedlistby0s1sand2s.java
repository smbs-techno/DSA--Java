package Linked_List;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class sortlinkedlistby0s1sand2s {
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
    static Node sort(Node head){
        Node zerohead=new Node(-1);
        Node onehead=new Node(-1);
        Node twohead=new Node(-1);
        Node zerotail=zerohead;
        Node onetail=onehead;
        Node twotail=twohead;
        Node temp=head;
        while (temp != null) {
            if(temp.data ==0){
                zerotail.next=temp;
                zerotail=temp;
            }
            else if(temp.data ==1){
                onetail.next=temp;
                onetail=temp;
            }
            else{
                twotail.next=temp;
                twotail=temp;
            }
        }
        if(onehead.next != null){
            zerotail.next=onehead.next;
        }
        else{
            zerotail.next=twohead.next;
        }
        onetail.next=twohead.next;
        twotail.next=null;
        return zerohead.next;
    //     int count0=0, count1=0, count2=0;
    //     Node temp=head;
    //     while(temp != null){
    //         if(temp.data==0) count0++;
    //         else if(temp.data==1) count1++;
    //         else if(temp.data==2) count2++;
    //         temp=temp.next;
    //     }
    //     temp=head;
    //     while(count0-->0){
    //         temp.data=0;
    //         temp=temp.next;
    //     }
    //     while(count1-->0){
    //         temp.data=1;
    //         temp=temp.next;
    //     }
    //     while(count2-->0){
    //         temp.data=2;
    //         temp=temp.next;
    //     }
        
    //     return head;
     }
    public static void main(String[] args) {
        Node head=null;
        head=insert(head, 1);
        head=insert(head, 2);
        head=insert(head, 0);
        head=insert(head, 1);
        head=insert(head, 0);
        head=insert(head, 2);
        Node temp=sort(head);
        printList(temp);
    }
}

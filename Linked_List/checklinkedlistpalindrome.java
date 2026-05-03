package Linked_List;

import java.util.ArrayList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class checklinkedlistpalindrome {

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head=head.next;
        }
        int i=0,j=list.size()-1;
        while(i<j){
            if(!(list.get(i).equals(list.get(j)))){
                return false;
            }
            i++;
            j--;
        }
        return true;
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
    
}

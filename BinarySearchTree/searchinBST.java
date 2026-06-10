package BinarySearchTree;

import java.util.Scanner;

public class searchinBST {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static Node insertion(Node root,int x){
        if(root==null) return new Node(x);
        if(root.val < x) root.right=insertion(root.right, x);
        else if(root.val > x) root.left=insertion(root.left, x);
        return root;
    }
    public static Node search(Node root,int x){
        if(root==null || root.val==x) return root;
        if(x < root.val) return search(root.left, x);
        return search(root.right, x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            root=insertion(root,x);
        }
        Node ans=null;
        int x=sc.nextInt();
        ans=search(root, x);
        if(ans!=null) System.out.print(ans.val);
        else System.out.print("Not Found");
        sc.close();
    }
}

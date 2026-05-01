package BinarySearchTree;

import java.util.Scanner;

public class treetraversals {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    static Node insert(Node root,int x){
        if(root==null) return new Node(x);
        if(root.val<x) root.right=insert(root.right, x);
        else if(root.val>x) root.left=insert(root.left, x);
        return root;
    }
    static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node root=null;
            for(int i=1;i<=n;i++){
                int x=sc.nextInt();
                root=insert(root, x);
            }
            preorder(root);
            System.out.println();
            inorder(root);
            System.out.println();
            postorder(root);
            System.out.println();
            System.out.println();
        }
        sc.close();
    }
}

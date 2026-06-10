package Binary_Tree;

import java.util.Scanner;

public class treetraversalsinbt {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    static Node createTree(Scanner sc){
        int x=sc.nextInt();
        if(x==-1) return null;
        Node root=new Node(x);
        root.left = createTree(sc);
        root.right = createTree(sc);
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
            Node root=createTree(sc);
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

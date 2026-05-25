package BinarySearchTree;

public class insertion {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
        }
    }
    static Node insert(Node root,int x){
        if(root==null) return new Node(x);
        else if(root.val<x) root.right=insert(root.right,x);
        else root.left=insert(root.left,x);
        return root;
    }
    public static void main(String[] args){
        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
    }
}
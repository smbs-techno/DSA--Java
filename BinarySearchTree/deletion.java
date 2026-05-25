package BinarySearchTree;

public class deletion {
    static class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val=val;
        }
    }
    static Node findmin(Node root){
        while(root.left !=null) root=root.left;
        return root;
    }
    static Node delete(Node root,int x){
        if(root==null) return null;
        if(x<root.val) root.left=delete(root.left,x);
        else if(x>root.val) root.right=delete(root.right,x);
        else{
            if(root.left==null && root.right==null) return null;
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            Node min=findmin(root.right);
            root.val=min.val;
            root.right=delete(root.right,min.val);
        }
        return root;
    }
}
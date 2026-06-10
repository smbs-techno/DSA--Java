package BinarySearchTree;

import java.util.Scanner;

public class LCA {
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
    public static Node lca(Node root, Node p, Node q){
        if(root==null) return null;
        if(root.val < p.val && root.val < q.val){
            return lca(root.right,p,q);
        }
        if(root.val > p.val && root.val > q.val){
            return lca(root.left,p,q);
        }
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        Node p=search(root, a);
        Node q=search(root, b);
        Node ans=lca(root, p, q);
        System.out.println(ans.val);
        sc.close();
    }
}

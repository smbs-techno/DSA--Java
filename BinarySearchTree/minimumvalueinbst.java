package BinarySearchTree;

import java.util.Scanner;

public class minimumvalueinbst {
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
    public static int min(Node root){
        while(root.left != null){
            root=root.left;
        }
        return root.val;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            root=insertion(root,x);
        }
        System.out.print(min(root));
        sc.close();
    }
}

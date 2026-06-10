package Binary_Tree;

import java.util.Scanner;

public class heightinbt {
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
    public static int height(Node root){
        if(root == null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=createTree(sc);
        System.out.println(height(root));
        sc.close();
    }
    
}

package Binary_Tree;

import java.util.Scanner;

public class countleafnodesinbt {
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
    public static int countleaf(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right==null) return 1;
        return countleaf(root.left)+countleaf(root.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=createTree(sc);
        System.out.println(countleaf(root));
        sc.close();
    }
}

package Strings;
import java.util.*;
public class stringpermutation {
    public static void permut(String str,String ans){
        if(str.length()==0){
            System.out.println(str);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String remaining=left+right;
            permut(remaining, ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        permut(s, ans);
        sc.close();
    }
}

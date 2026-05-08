package Strings;

public class removeoutermostparenthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')') count--;
            if(count!=0) sb.append(ch);
            if(ch=='(') count++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}

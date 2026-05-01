package Stack;
import java.util.*;
public class validparentheses {
    static boolean valid(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt((i));
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                if(st.peek()=='(' && ch==')' || 
                st.peek()=='{' && ch=='}' || st.peek()=='[' && ch==']'){
                    st.pop();
                }
                else return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s="({[]}())";
        if(valid(s)) System.out.println("Yes");
        else System.out.println("No");
    }
}

package Stack;
import java.util.*;
public class duplicateparenthesis{
    static boolean duplicate(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!(ch==')' || ch=='}' || ch==']')){
                st.push(ch);
            }
            else{
                int count=0;
                while(!st.isEmpty() && ch==')'&& st.peek()!='(' || ch=='}'&& st.peek()!='{' || ch==']'&& st.peek()!='['){
                    count++;
                    st.pop();
                }
                st.pop();
                if(count<1) return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s="((a+b)+(c+d))";
        String s1="(((a+b)+(c+d)))";
        System.out.println(duplicate(s));
        System.out.println(duplicate(s1));

    }

}
package Stack;
import java.util.*;
public class reverseastring {
     static String reverse(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            st.push(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            char ch1=st.pop();
            sb.append(ch1);
        }
        return sb.toString();
     }
     public static void main(String[] args) {
        String s="SRI";
        System.out.println(reverse(s));
    }
}

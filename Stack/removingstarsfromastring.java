package Stack;

import java.util.Stack;

public class removingstarsfromastring {
    public static String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)) st.push(ch);
            else{
                st.pop();
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=st.size()-1;i>=0;i--){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String s="leet**cod*e";
        System.out.print(removeStars(s));
    }
}

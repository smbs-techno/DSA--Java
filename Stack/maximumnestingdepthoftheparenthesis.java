package Stack;

import java.util.Stack;

public class maximumnestingdepthoftheparenthesis{
    public static int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                count=st.size();
            }
            else if(ch==')'){
                max=Math.max(max,count);
                st.pop();
                count=st.size();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s="8*((1*(5+6))*(8/6))";
        System.out.println(maxDepth(s));
    }
}

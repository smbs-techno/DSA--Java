package Stack;
import java.util.*;
public class decodestrings {
    public static String decodeString(String s) {
        Stack<Integer> number=new Stack<>();
        Stack<String> str=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                number.push(num);
                str.push(curr.toString());
                num=0;
                curr.setLength(0);
            }
            else if(ch==']'){
                int k=number.pop();
                String prev=str.pop();
                StringBuilder temp=new StringBuilder(prev);
                for(int j=0;j<k;j++){
                    temp.append(curr);
                }
                curr=temp;
            }
            else curr.append(ch);
        }
        return curr.toString();
    }
    public static void main(String[] args) {
        String s="3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}

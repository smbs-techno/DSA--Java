package Greedy;
import java.util.*;
public class removeduplicateletters{
    public static String remove(String s) {
        int[] freq=new int[26];
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']--;
            if(visited[ch-'a']) continue;
            while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>0){
                char removed = st.pop();
                visited[removed-'a']=false;
            }
            st.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "bcabc";
        System.out.print(remove(s));
    }
}
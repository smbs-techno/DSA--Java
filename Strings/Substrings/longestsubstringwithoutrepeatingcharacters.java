package Strings.Substrings;

import java.util.HashSet;

public class longestsubstringwithoutrepeatingcharacters {
    static int solve(String s){
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            max=Math.max(max,i-l+1);
        }
        return max;

    }
    public static void main(String[] args) {
        String s1="abcdefa";
        String s2="aabbcdef";
        String s3="abcbdefb";
        System.out.println(solve(s1));
        System.out.println(solve(s2));
        System.out.println(solve(s3));
    }
}

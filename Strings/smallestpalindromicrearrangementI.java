package Strings;

import java.util.Arrays;

public class smallestpalindromicrearrangementI{
     public static String smallestPalindrome(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        char[] half=new char[n/2];
        for(int i=0;i<n/2;i++){
            half[i]=s.charAt(i);
        }
        Arrays.sort(half);
        for(char ch : half){
            sb.append(ch);
        }
        if(n%2==1) sb.append(s.charAt(n/2));
        for(int i=half.length-1;i>=0;i--){
            sb.append(half[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "bacdcab";
        System.out.println(smallestPalindrome(s));
    }
}

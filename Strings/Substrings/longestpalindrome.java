package Strings.Substrings;
import java.util.*;
public class longestpalindrome{
    public static int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ans=0;
        boolean odd=false;
        for(int i : map.values()){
            if(i%2 == 0) ans+=i;
            else{
                ans+=i-1;
                odd=true;
            }
        }
        if(odd) ans=ans+1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("adccccdb"));
    }
}
package Hashing;
import java.util.*;
public class maximumlengthsubstringwithatmost2occurrences{
    public static int maximumLengthSubstring(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       int max=0;
       int left=0;
       for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            max=Math.max(max,right-left+1);
       } 
       return max;
    }
    public static void main(String[] args){
        String s="bcbbbcba";
        System.out.print(maximumLengthSubstring(s));
    }
}
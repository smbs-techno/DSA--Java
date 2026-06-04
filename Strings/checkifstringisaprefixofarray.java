package Strings;
public class checkifstringisaprefixofarray{
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            if(sb.toString().equals(s)) return true;
            if(sb.length()>s.length()) return false;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "iloveleetcode"; 
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s, words));
    }
}
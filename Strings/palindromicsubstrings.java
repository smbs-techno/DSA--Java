package Strings;
public class palindromicsubstrings{
    public static boolean palindrome(String s){
       int left=0;
       int right=s.length()-1;
       while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
       }
       return true;
    }
    public static int countSubstrings(String s) {
        int count=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            ans="";
            for(int j=i;j<s.length();j++){
                ans+=s.charAt(j);
                if(palindrome(ans)) count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String s="aaa";
        System.out.print(countSubstrings(s));
    }
}
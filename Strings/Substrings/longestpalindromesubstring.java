package Strings.Substrings;

public class longestpalindromesubstring {
    public static boolean ispalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
        //optimized way of checking palindrome
    }
    public static String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String s2=s.substring(i,j+1);
                if(ispalindrome(s2)){
                    int len=s2.length();
                    if(len>max){
                        sb.setLength(0);
                        sb.append(s2);
                        max=len;
                    }
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}

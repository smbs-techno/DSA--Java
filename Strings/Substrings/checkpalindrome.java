package Strings.Substrings;

public class checkpalindrome {
    static boolean solve(String s){
        StringBuilder sb=new StringBuilder(s);
        String s1=sb.reverse().toString();
        if(s.equals(s1)) return true;
        return false;
    }
    public static void main(String[] args) {
        String s="abccba";
        System.out.println(solve(s));
    }
}

package Strings;

public class rotatestring {
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        return ((s+s).contains(goal));
    }
    public static void main(String[] args) {
        String a="abcde";
        String b="cdeab";
        System.out.println(rotateString(a, b));
    }
}

package Strings;

public class stringtointegeratoi {
    public static int myAtoi(String s) {
        int i=0;
        int sign=1;
        long res=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ') i++;
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int x=s.charAt(i)-'0';
            res=res*10 + x;
            if(res*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if(res*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)(sign*res);
    }
    public static void main(String[] args) {
        String s="-124532edfds+";
        System.out.println(myAtoi(s));

    }
}

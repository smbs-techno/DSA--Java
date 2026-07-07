package Maths;
public class concatenatenonzerodigitsandmultiplybysumI{
    public static long sumAndMultiply(int n) {
        long sum=0;
        long rev=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'0';
            if(d!=0){
                sum+=d;
                rev=rev*10+d;
            }
        }
        return sum*rev;
    }
    public static void main(String[] args) {
        int n=10203004;
        System.out.print(sumAndMultiply(n));
    }
}
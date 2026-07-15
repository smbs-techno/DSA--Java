package Maths;

public class gcd {
    public static int gcdans(int a,int b){
        if(b==0) return a;
        return gcdans(b,a%b);
    }
    public static void main(String[] args) {
        int a = 16;
        int b = 20;
        System.out.print(gcdans(a, b));
    }
}

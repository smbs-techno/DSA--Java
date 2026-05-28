package Recursion;
public class powxn{
    public static double power(double x, int n){
        if(n==0) return 1;
        double half=power(x,n/2);
        if(n%2==0) return half*half;
        return half*half*x;
    }
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return power(x,n);

    }
    public static void main(String[] args) {
        System.out.println(power(2.0000,10));
    }
}
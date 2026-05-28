package Bit_Manipulation;

public class countgoodnumbers {
    static int MOD=1000000007;
    public static long power(long x,long n){
        long x1=x;
        long ans=1;
        while(n>0){
            if((n&1)==1){
                ans=(ans*x1)%MOD;
            }
            x1=(x1*x1)%MOD;
            n=n>>1;
        }
        return ans;
    }
    public static int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long result=(power(5,even)*power(4,odd))%MOD;
        return (int)result;
    }
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));
    }
}

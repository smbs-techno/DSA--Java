package Bit_Manipulation;

public class powxn {
    static int M=1000000007;
    public static double solve(int a,int n){
        int x = a;
        int ans = 1;
        long N=n;
        if(N<0){
            x=1/a;
            N=-N;
        }
        while(N>0){
            if((N&1) == 1){
                ans=(ans*x) % M;
            }
            x=(x*x) % M;
            N=N>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solve(2,10));
    }
}

package Bit_Manipulation;

public class countingbits {
    public static int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=1;i<=n;i++){
            ans[i]=ans[i/2] + (i&1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int[] ans=countBits(n);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}

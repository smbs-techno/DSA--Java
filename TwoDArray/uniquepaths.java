package TwoDArray;

public class uniquepaths {
     public static int uniquePaths(int m, int n) {
        long ans=1;
        int total=m+n-2; //down = m-1 steps, right= n-1 steps total = m-1 + n-1=m+n-2
        int r=Math.min(m-1,n-1); //both down and right will give correct values but for optimization we should use the min value
        for(int i=1;i<=r;i++){
            ans=ans*(total-r+i)/i;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int m=7;
        int n=3;
        System.out.print(uniquePaths(m,n));
    }
}

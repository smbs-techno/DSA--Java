package Arrays;

public class getmaximumingeneratedarray {
    public static int solve(int n){
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        int max=1;
        for(int i=2;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i/2];
                max=Math.max(arr[i],max);
            }
            else{
                arr[i]=arr[i/2]+arr[i/2 + 1];
                max=Math.max(arr[i],max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int n=7;
        System.out.print(solve(n));
    }
}

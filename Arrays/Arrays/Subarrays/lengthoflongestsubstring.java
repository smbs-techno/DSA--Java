package Arrays.Arrays.Subarrays;

public class lengthoflongestsubstring {
    static int solve(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int maxVal=Integer.MIN_VALUE;
            int minVal=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
               maxVal=Math.max(arr[j],maxVal);
               minVal=Math.min(arr[j],minVal);
               if((maxVal-minVal)==j-i){
                ans=Math.max(ans,j-i+1);
               }
            }
        }
    return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,6,5};
        System.out.println(solve(arr));
    }
}

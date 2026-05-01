package Arrays.Arrays.Subarrays;
public class maximumsubarray {
    //brute force -> time complexity : n**3
    // static int maxsubarraysum(int[] arr){
    //     int sum=0;
    //     int max=Integer.MIN_VALUE;
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i;j<n;j++){
    //             sum=0;
    //             for(int k=i;k<=j;k++){
    //                 sum+=arr[k];
    //             }
    //             max=Math.max(sum,max);
    //         }
    //     }
    //     return max;
    // }
    //time complexity-n**2
    // static int maxsubarraysum(int[] arr){
    //     int sum=0;
    //     int max=Integer.MIN_VALUE;
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //        sum=0;
    //        for(int j=i;j<n;j++){
    //         sum+=arr[j];
    //        }
    //        max=Math.max(sum,max);
    //     }
    //     return max;
    // }
    
    //kadane algorithm
    static int maxsubarraysum(int[] arr){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum<0) currsum=0;
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        System.out.println(maxsubarraysum(arr));
    }
}

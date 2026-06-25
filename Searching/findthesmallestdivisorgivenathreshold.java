package Searching;

public class findthesmallestdivisorgivenathreshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int low=1;
        int high=max;
        int mid;
        int ans=0;
        while(low<=high){
            mid=low+(high-low)/2;
            long sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=(int) Math.ceil((double)nums[i]/mid);
            }
            if(sum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,9};
        int th=6;
        System.out.print(smallestDivisor(arr, th));
    }
}

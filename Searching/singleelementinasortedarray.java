package Searching;

public class singleelementinasortedarray {
    public static int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int low=0,high=n-1,mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(mid==0 && nums[0]!=nums[1]) return nums[0];
            if(mid==n-1 && nums[n-1]!=nums[n-2]) return nums[n-1];
            if(nums[mid-1]!=nums[mid] && nums[mid]!=nums[mid+1]) return nums[mid];
            if(mid%2==0){
                if(nums[mid]==nums[mid-1]) high=mid-1;
                else low=mid+1;
            }
            else{
                if(nums[mid]==nums[mid-1]) low=mid+1;
                else high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
}

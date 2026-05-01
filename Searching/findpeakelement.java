package Searching;

public class findpeakelement {
    public static int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1,mid;
        while(low<high){
            mid=low+(high-low) / 2;
            if(nums[mid]>nums[mid+1]) high=mid;
            else low=mid+1;
        }
        return low;
        // if(nums.length==1) return 0;
        // if(nums.length==2){
        //     if(nums[0]>=nums[1]) return 0;
        //     else return 1;
        // }
        // if(nums.length>2){
        //     if(nums[0]>nums[1]) return 0;
        //     else if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;
        // } 
        // for(int i=1;i<nums.length-1;i++){
        //     if(nums[i]>=nums[i-1] && nums[i]>=nums[i+1]) return i;
        // }
        // return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
}

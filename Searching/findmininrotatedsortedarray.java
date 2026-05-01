package Searching;

public class findmininrotatedsortedarray {
    public static int findMin(int[] nums) {
        int low=0,high=nums.length-1,mid;
        while(low<high){
            mid=(low+high)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}

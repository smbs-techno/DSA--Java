package Searching;

public class findfirstandlastpositionofelementinsortedarray{
    public static int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid;
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                high=mid-1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                low=mid+1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
            
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int t=8;
        int[] arr1=searchRange(arr, t);
        for(int i=0;i<2;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
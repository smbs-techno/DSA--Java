package Sliding_Window;

public class binarysubarrayswihsum {
     public static int solve(int[] nums,int goal){
        if(goal<0) return 0;
        int count=0;
        int sum=0;
        int left=0,right=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>goal){
                sum=sum-nums[left];
                left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        return solve(nums,goal)-solve(nums,goal-1);



        // brute force - O(n^2)
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==goal) count++;
        //     }
        // }
        // return count;
    }
    public static void main(String[] args) {
        int[] nums={1,0,0,1,0,1};
        int goal=2;
        System.out.println(numSubarraysWithSum(nums, goal));
    }
}

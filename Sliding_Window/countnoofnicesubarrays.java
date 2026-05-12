package Sliding_Window;

public class countnoofnicesubarrays {
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
}
}

package Greedy;

public class jumpgameII {
    public static int jump(int[] nums) {
        int jumps=0;
        int farthest=0;
        int l=0,r=0;
        while(r<nums.length-1){
            farthest=0;
            for(int i=l;i<=r;i++){
                farthest=Math.max(i+nums[i],farthest);
            }
            l=r+1;
            r=farthest;
            jumps++;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.print(jump(nums));
    }
}

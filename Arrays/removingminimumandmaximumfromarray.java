package Arrays;
public class removingminimumandmaximumfromarray{
    public static int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIdx=0;
        int maxIdx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIdx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minIdx=i;
            }
        }
        int left=Math.min(minIdx,maxIdx);
        int right=Math.max(minIdx,maxIdx);
        int front=right+1;
        int back=nums.length-left;
        int both=(left+1) + (nums.length-right);
        return Math.min(front,Math.min(back,both));
    }
    public static void main(String[] args){
        int[] arr={2,10,7,5,-8,4,3};
        System.out.print(minimumDeletions(arr));
    }
}
package Arrays;
public class maximumtotalsubarraysumI{
    public static long maxTotalValue(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i : nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return (long)(max-min)*k;
    }
    public static void main(String[] args) {
        int[] nums={4,2,5,1};
        int k = 3;
        System.out.print(maxTotalValue(nums,k));
    }
}
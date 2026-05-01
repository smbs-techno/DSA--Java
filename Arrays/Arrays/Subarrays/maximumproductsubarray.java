package Arrays.Arrays.Subarrays;

public class maximumproductsubarray {
    public static int maxProduct(int[] nums) {
        int prefix=1,suffix=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix*=nums[i];
            suffix*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
    //    int p=1;
    //    int max=0;
    //    if(nums.length==1) return nums[0];
    //    for(int i=0;i<nums.length;i++){
    //     p=1;
    //     for(int j=i;j<nums.length;j++){
    //         p=p*nums[j];
    //         max=Math.max(p,max);
    //     }
    //    }
    //    return max;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
}

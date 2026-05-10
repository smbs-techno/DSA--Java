package Sliding_Window;

public class maximumconsecutiveonesIII {
    public static int longestOnes(int[] nums, int k) {
        //optimal - O(n)
        int zeroes=0;
        int left=0,right=0;
        int maxlen=0;
        while(right < nums.length){
            if(nums[right]==0) zeroes++;
            if(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            if(zeroes<=k){
                int len=right-left+1;
                maxlen=Math.max(maxlen,len);
            }
            right++;
        }
        return maxlen;
        //brute force - O(n^2)
        // int maxlen=0;
        // for(int i=0;i<nums.length;i++){
        //     int zeroes=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0) zeroes++;
        //         if(zeroes<=k){
        //             int len=j-i+1;
        //             maxlen=Math.max(maxlen,len);
        //         }
        //         else break;
        //     }
        // }
        // return maxlen;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(arr, k));
    }
}

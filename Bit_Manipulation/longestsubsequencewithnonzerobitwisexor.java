package Bit_Manipulation;
public class longestsubsequencewithnonzerobitwisexor {
    public static  int longestSubsequence(int[] nums) {
        // If total XOR != 0 → take all.
        // If XOR == 0 → remove one non-zero element.
        // If all are 0 → no valid subsequence.
        
        int xor=0;
        int zeroes=0;
        int n=nums.length;
        for(int i : nums){
            xor^=i;
            if(i==0) zeroes++;
        }
        if(xor != 0) return n;
        if(zeroes==n) return 0;
        return n-1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(longestSubsequence(nums));
    }
}

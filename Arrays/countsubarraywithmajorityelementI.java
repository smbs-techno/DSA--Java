package Arrays;

public class countsubarraywithmajorityelementI {
    public static int countSubarrays(int[] nums, int k) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int freq = 0;
            for(int j = i; j < nums.length; j++) {
                if(nums[j] == k) {
                    freq++;
                }
                int len = j - i + 1;
                if(2 * freq > len) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,2,3};
        int k=2;
        System.out.print(countSubarrays(nums, k));
    }
}

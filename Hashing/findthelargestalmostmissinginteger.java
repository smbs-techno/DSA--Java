package Hashing;
import java.util.HashMap;
public class findthelargestalmostmissinginteger {
    public static int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        if (k == nums.length) {
            int max = -1;
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        if (k == 1) {
            int max = -1;
            for (int num : nums) {
                if (map.get(num) == 1) {
                    max = Math.max(max, num);
                }
            }
            return max;
        }
        int ans = -1;
        if (map.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }
        if (map.get(nums[nums.length - 1]) == 1) {
            ans = Math.max(ans, nums[nums.length - 1]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={3,9,7,2,1,7};
        int k = 4;
        System.out.println(largestInteger(nums, k));
    }
}

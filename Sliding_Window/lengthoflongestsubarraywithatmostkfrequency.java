package Sliding_Window;

import java.util.HashMap;

public class lengthoflongestsubarraywithatmostkfrequency {
    public static int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        int left=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1,2,3,1,2};
        int k = 2;
        System.out.println(maxSubarrayLength(nums, k));
    }
}

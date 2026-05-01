package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;){
                int p=j+1,q=nums.length-1;
                while(p<q){
                    long sum=(long) nums[i]+nums[j]+nums[p]+nums[q];
                    if(sum<target) p++;
                    else if(sum>target) q--;
                    else{
                        list.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
                        p++;
                        q--;
                        while(p<q && nums[p]==nums[p-1]) p++;
                    }
                }
                j++;
                while(j<nums.length && nums[j]==nums[j-1]) j++;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> res = fourSum(arr, target);
        System.out.print(res);
    }
}

package Hashing;

import java.util.HashSet;

public class smallestmissingintegergreaterthansequentialprefixsum {
     public static int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        if(!(set.contains(sum))) return sum;
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={3,4,5,1,12,14,13};
        System.out.println(missingInteger(nums));
    }
}

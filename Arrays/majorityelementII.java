package Arrays;

import java.util.ArrayList;
import java.util.List;

public class majorityelementII {
     public static List<Integer> majorityElement(int[] nums) {
        int n1=0;
        int n2=0;
        int c1=0;
        int c2=0;
        for(int i : nums){
            if(i==n1) c1++;
            else if(i==n2) c2++;
            else if(c1==0){
                n1=i;
                c1=1;
            }
            else if(c2==0){
                n2=i;
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> res=new ArrayList<>();
        int count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n1) count1++;
            else if(nums[i]==n2) count2++;
        }
        if(count1>nums.length/3) res.add(n1);
        if(count2>nums.length/3) res.add(n2);
        return res;
    }
    public static void main(String[] args) {
        int[] arr={3,2,3,4,4};
        List<Integer> res=majorityElement(arr);
        System.out.print(res);
    }
}

package Arrays;
import java.util.*;
public class minpositivesumsubarray{
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int sum=0;
            for(int j=i;j<nums.size();j++){
                sum+=nums.get(j);
                int len=j-i+1;
                if(len>=l && len<=r){
                    if(sum>0){
                        min=Math.min(min,sum);
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(3);
        nums.add(-2);
        nums.add(1);
        nums.add(4);
        System.out.print(minimumSumSubarray(nums, 2, 3));
    }
}
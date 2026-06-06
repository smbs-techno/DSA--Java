package Arrays;
import java.util.*;
public class checkifarrayisgood{
     public static boolean isGood(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(nums[i],max);
        }
        if(map.get(max)!=2) return false;
        int length=nums.length;
        if(length!=max+1) return false;
        for(int i : map.keySet()){
            if(i!=max){
                if(map.get(i)>=2) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,3,3,2};
        if(isGood(arr)) System.out.print("true");
        else System.out.print("false");
    }
}
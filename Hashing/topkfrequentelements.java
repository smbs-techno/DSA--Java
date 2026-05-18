package Hashing;
import java.util.*;

public class topkfrequentelements{
    public static int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
            list.sort((a,b)->b.getValue()-a.getValue());
            int[] ans=new int[k];
            for(int i=0;i<k;i++){
                ans[i]=list.get(i).getKey();
            }
            return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,1,2,3};
        int k=2;
        int[] ans=topKFrequent(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
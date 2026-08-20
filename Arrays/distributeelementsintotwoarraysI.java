import java.util.ArrayList;

public class distributeelementsintotwoarraysI {
     public static int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }
        int[] ans=new int[nums.length];
        int idx=0;
        for(int i=0;i<arr1.size();i++){
            ans[i]=arr1.get(i);
            idx++;
        }
        for(int i=0;i<arr2.size();i++){
            ans[idx++]=arr2.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={5,4,3,8};
        int[] ans=resultArray(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}

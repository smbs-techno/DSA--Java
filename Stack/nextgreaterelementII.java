package Stack;
import java.util.*;

public class nextgreaterelementII {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<2*nums.length;i++){
            int index=i%nums.length;
            while(st.size()!=0 && nums[st.peek()]<nums[index]){
                ans[st.peek()]=nums[index];
                st.pop();
            }
            if(i<nums.length) st.push(index);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,10,12,1,11};
        int[] ans=nextGreaterElements(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}

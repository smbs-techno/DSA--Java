package Stack;
import java.util.*;

public class nextgreaterelement{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] ans=new int[nums2.length];
            Stack<Integer> st=new Stack<>();
            HashMap<Integer,Integer> map=new HashMap<>();
            Arrays.fill(ans,-1);
            for(int i=0;i<nums2.length;i++){
                while(st.size()!=0 && nums2[st.peek()]<nums2[i]){
                    ans[st.peek()]=nums2[i];
                    st.pop();
                }
                st.push(i);
            }
            for(int i=0;i<nums2.length;i++){
                map.put(nums2[i],ans[i]);
            }
            int[] ansfinal=new int[nums1.length];
            for(int i=0;i<nums1.length;i++){
                ansfinal[i]=map.get(nums1[i]);
            }
        return ansfinal;
    }
    public static void main(String[] args) {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        int[] ans=nextGreaterElement(nums1, nums2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
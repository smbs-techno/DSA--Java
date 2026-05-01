package Stack;
import java.util.*;
public class maxareainhistogram {
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
        int[] left=new int[heights.length];
        int[] right=new int[heights.length];
        int l=heights.length;
        Arrays.fill(left,-1);
        Arrays.fill(right,l);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<right.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                right[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        st.clear();
        for(int i=left.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                left[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        int max=0;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=right[i]-left[i]-1;
            int area=height*width;
            max=Math.max(area,max);
        }
        System.out.println(max);
    }
}

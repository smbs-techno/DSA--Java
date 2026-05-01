package Stack;
import java.util.*;
public class nextsmallerelement{
    public static void main(String[] args) {
        int[] arr={10,18,12,20,7,4,2,15};
        int[] b=new int[8];
        Arrays.fill(b,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<8;i++){
            while(st.size()!=0 && arr[st.peek()]>arr[i]){
                b[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        for(int i=0;i<8;i++){
            System.out.print(b[i] + " ");
        }
    }
} 
    


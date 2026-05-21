package Stack;

import java.util.*;

public class sumofsubarrayminimums {
    public static int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        Arrays.fill(nse,n);
        Arrays.fill(pse,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                nse[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                pse[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        long sum=0;
        int mod=1000000007;
        for(int i=0;i<n;i++){
            long left=i-pse[i];
            long right=nse[i]-i;
            long c=(left*right*arr[i])%mod;
            sum=(sum + c)%mod;
        }
        return (int)sum;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        System.out.print(sumSubarrayMins(arr));
    }
}

package Stack;
import java.util.*;
public class asteroidcollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>=0) st.push(asteroids[i]);
            else{
                int x=asteroids[i] * -1;
                while(!st.isEmpty() && st.peek()>0 && x>st.peek()){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==x) st.pop();
                else if(st.isEmpty() || st.peek()<0) st.push(asteroids[i]);
            }
        }
        
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,5,-6,2,-1,4};
        int[] ans=asteroidCollision(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}

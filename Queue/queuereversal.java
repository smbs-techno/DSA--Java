package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuereversal {
    static void solve(Queue<Integer> qu){
        Stack<Integer> st=new Stack<>();
        while(!qu.isEmpty()){
            st.push(qu.poll());
        }
        while(!st.isEmpty()){
            qu.offer(st.pop());
        }
        while(!qu.isEmpty()){
            System.out.print(qu.poll() + " ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        qu.offer(4);
        qu.offer(5);
        solve(qu);
    }
}

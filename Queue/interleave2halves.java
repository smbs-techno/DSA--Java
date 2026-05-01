package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class interleave2halves {
    static void solve(Queue<Integer> first){
        int n=first.size()/2;
        Queue<Integer> qu1=new LinkedList<>();
        for(int i=0;i<n;i++) qu1.offer(first.poll());
        while(!(qu1.isEmpty())){
            first.offer(qu1.poll());
            first.offer(first.poll());
        }
        while(!first.isEmpty()){
            System.out.print(first.poll()+" ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        qu.offer(4);
        qu.offer(5);
        qu.offer(6);
        qu.offer(7);
        qu.offer(8);
        qu.offer(9);
        qu.offer(10);
        solve(qu);
    }
}

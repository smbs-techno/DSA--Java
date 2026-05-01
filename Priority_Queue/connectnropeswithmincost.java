package Priority_Queue;

import java.util.PriorityQueue;
public class connectnropeswithmincost {
    static int solve(PriorityQueue<Integer> pq){
        int sum=0;
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            int ts=a+b;
            pq.add(ts);
            sum+=ts;
        }
        return sum;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(6);
        System.out.print(solve(pq));
    }
}

package Queue;
import java.util.*;
public class implementqueueusingdeque {
    static class Queue{
        Deque<Integer> dq=new LinkedList<>();
        public void offer(int data){
            dq.addLast(data);
        }
        public int poll(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue qu=new Queue();
        qu.offer(1);
        qu.offer(2);
        qu.offer(3);
        System.out.println("peek =" + qu.peek());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
    }
}

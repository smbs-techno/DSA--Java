package Priority_Queue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class topkelements {
    static int[] solve(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>();
        for(int key : map.keySet()){
            pq.add(new int[]{key,map.get(key)});
            if(pq.size()>k) pq.poll();
        }
        int[] ans=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll()[0];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3};
        int k=2;
        int[] a=solve(arr, k);
        for(int i : a){
            System.out.print(i + " ");
        }

    }
}

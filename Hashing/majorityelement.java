package Hashing;

import java.util.HashMap;

public class majorityelement {
    static void solve(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n=arr.length/3;
        for(int i : map.keySet()){
            if(map.get(i)>n) System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2};
        solve(arr);
    }
}

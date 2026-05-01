package Arrays.Arrays.Subarrays;

import java.util.HashSet;

public class longestconsecutivesequence{
    // tc->O(nlogn)
    // static int solve(int[] arr){
    //     Arrays.sort(arr);
    //     int c=1;
    //     int max=1;
    //     for(int i=0;i<arr.length-1;i++){
    //         if((arr[i]-arr[i+1])==-1){
    //             c++;
    //             max=Math.max(c,max);
    //         }
    //         else if(arr[i]-arr[i+1]==0){
    //             continue;
    //         }
    //         else c=1;
    //     }
    //     return max;
    // }
    // tc->O(n),using hashset
    static int solve(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        int curr=0;
        int count=0;
        int max=0;
        for(int x:set){
            if(!set.contains(x-1)){
                curr=x;
                count=1;
            }
            while(set.contains(curr+1)){
                curr++;
                count++;
            }
            max=Math.max(count,max);
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr={2,1,0,1};
        System.out.println(solve(arr));
    }
}
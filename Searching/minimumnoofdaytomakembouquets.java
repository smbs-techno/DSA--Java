package Searching;

import java.util.Arrays;

public class minimumnoofdaytomakembouquets{
    public static int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        long s=(long) m*k;
        if(s>n) return -1;
        int min=Arrays.stream(bloomDay).min().getAsInt();
        int max=Arrays.stream(bloomDay).max().getAsInt();
        int low=min,high=max,mid;
        int ans=0;
        while(low<=high){
            mid=low + (high-low)/2;
            int m1=0,k1=0;
            for(int i=0;i<n;i++){
                if(mid>=bloomDay[i]){
                    k1++;
                    if(k1==k){
                        k1=0;
                        m1++;
                    }
                }
                else{
                    k1=0;
                }
            }
            if(m1>=m){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={7,7,7,7,12,7,7}; 
        int m = 2, k = 3;
        System.out.println(minDays(arr, m, k));
    }
}
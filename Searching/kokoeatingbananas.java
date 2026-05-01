package Searching;

import java.util.Arrays;

public class kokoeatingbananas {
    public static int minEatingSpeed(int[] piles, int h) {
            int n=piles.length;
            int max=Arrays.stream(piles).max().getAsInt();
            int low=1,high=max,mid;
            int ans=0;
            while(low<=high){
                mid=low+(high-low)/2;
                long sum=0;
                for(int i=0;i<n;i++){
                    sum+=(int)Math.ceil((double)piles[i] / mid);
                }
                if(sum<=h){
                    ans=mid;
                    high=mid-1;
                }
                else low=mid+1;
            }
            return ans;
        }

    
                
            // int n=piles.length;
            // int max=Arrays.stream(piles).max().getAsInt();
            // for(int i=1;i<=max;i++){
            //     long sum=0;
            //     for(int j=0;j<n;j++){
            //         sum+=(int)Math.ceil((double)piles[j] / i);
            //     }
            //     if(sum<=h) return i;
            // }
            // return max;
        
    public static void main(String[] args) {
        int[] arr={30,11,23,4,20};
        int h=5;
        System.out.println(minEatingSpeed(arr, h));
    }
}
package Searching;

public class capacitytoshippackageswithinddays {
     public static int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max,high=sum;
        int mid;
        int ans=low;
        while(low<=high){
            mid=low+(high-low)/2;
            int s=0;
            int d=1;
            for(int i=0;i<weights.length;i++){
                if(s+weights[i]>mid){
                    d++;
                    s=weights[i];
                }
                else s+=weights[i];
            }
            if(d<=days){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10}; int days = 5;
        System.out.println(shipWithinDays(arr, days));
    }
}

package Arrays;

import java.util.Arrays;

public class mincostofbuyingcandieswithdiscount{
    public static int minimumCost(int[] cost) {
       Arrays.sort(cost);
       int count=0;
       int mincost=0;
       for(int i=cost.length-1;i>=0;i--){
        count++;
        if(count%3 != 0){
            mincost+=cost[i];
        }
       }
       return mincost;
    }
    public static void main(String[] args) {
        int[] cost={6,5,7,9,2,2};
        System.out.println(minimumCost(cost));
    }
}
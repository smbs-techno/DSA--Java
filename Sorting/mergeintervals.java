
import java.util.ArrayList;
import java.util.Arrays;

public class mergeintervals {
     public static int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
       ArrayList<int[]> ans=new ArrayList<>();
       int start=intervals[0][0];
       int end=intervals[0][1];
       for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
       }
       ans.add(new int[]{start,end});
       return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        int[][] ans=merge(intervals);
        System.out.print("[");
        for(int i=0;i<ans.length;i++){
            System.out.print("[");
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]);
                if(j != ans[i].length -1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            if(i!= ans.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}

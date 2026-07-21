package Arrays.Subarrays;
import java.util.ArrayList;
import java.util.Arrays;

public class insertinterval {
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
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] Interval = new int[intervals.length+1][2];
        Interval[0][0]=newInterval[0];
        Interval[0][1]=newInterval[1];
        for(int i=1;i<Interval.length;i++){
            Interval[i][0]=intervals[i-1][0];
            Interval[i][1]=intervals[i-1][1];
        }
        return merge(Interval);
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval ={4,8};
        System.out.println(insert(intervals, newInterval));
    }
}

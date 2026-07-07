package Arrays;
import java.util.*;
public class removecoveredintervals{
    public static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> {
        if(a[0]==b[0]){
            return b[1]-a[1];
        }
        return a[0]-b[0];
        });
        int count=0;
        int end=0;
        for(int[] interval : intervals){
            if(interval[1]>end){
                count++;
                end=interval[1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] intervals={{1,4},{3,6},{2,8}};
        System.out.print(removeCoveredIntervals(intervals));
    }
}
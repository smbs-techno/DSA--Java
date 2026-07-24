package Greedy;

import java.util.Arrays;

public class minimumnoofarrowstoburstballoons {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int end=points[0][1];
        int shoot=1;
        for(int i=1;i<points.length;i++){
            if(end>=points[i][0]){
                end=Math.min(end,points[i][1]);
            }
            else{
                shoot++;
                end=points[i][1];
            } 
        }
        return shoot;
    }
    public static void main(String[] args) {
       int[][] points = {{10,16},{2,8},{1,6},{7,12}};
       System.out.println(findMinArrowShots(points));
    }
}

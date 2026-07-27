package Greedy;
import java.util.*;
public class twocityscheduling{
     public static int twoCitySchedCost(int[][] costs) {
        // Difference = extra cost of choosing A instead of B.
        // Smaller difference => stronger reason to send to A.
        // Larger difference => stronger reason to send to B.

    
        Arrays.sort(costs,(a,b)-> Integer.compare(a[0]-a[1],b[0]-b[1]));
        int min_costs=0;
        for(int i=0;i<costs.length/2;i++){
            min_costs+=costs[i][0];
        }
        for(int i=costs.length/2;i<costs.length;i++){
            min_costs+=costs[i][1];
        }
        return min_costs;
    }
    public static void main(String[] args) {
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        System.out.println(twoCitySchedCost(costs));
    }
}
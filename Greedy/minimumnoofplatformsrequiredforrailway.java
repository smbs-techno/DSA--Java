package Greedy;
import java.util.*;

public class minimumnoofplatformsrequiredforrailway {
    public static int solve(int[] arr,int[] dep,int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0;
        int platforms=1;
        int answers=1;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                i++;
                platforms++;
            }
            else{
                platforms--;
                j++;
            }
        }
        answers=Math.max(platforms,answers);
        return answers;
    }
    public static void main(String[] args) {
        int[] arr={900,945,955,1100,1500,1800};
        int[] dep={920,1200,1130,1150,1900,2000};
        int n=6;
        System.out.println(solve(arr, dep, n));
    }
}

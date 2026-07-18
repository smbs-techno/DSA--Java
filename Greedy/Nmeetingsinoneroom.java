package Greedy;
import java.util.*;
public class Nmeetingsinoneroom {
    public static ArrayList<Integer> solve(int n, int[] start,int[] end){
        int[][] meeting=new int[n][3];
        for(int i=0;i<n;i++){
            meeting[i][0]=start[i];
            meeting[i][1]=end[i];
            meeting[i][2]=i+1;
        }
        Arrays.sort(meeting, (a,b)-> {
            if(a[1]==b[1]) return a[2]-b[2];
            return a[1]-b[1];
        });
        ArrayList<Integer> ans=new ArrayList<>();
        int lastIndex=-1;
        for(int i=0;i<n;i++){
            if(meeting[i][0]>=lastIndex){
                ans.add(meeting[i][2]);
                lastIndex=meeting[i][1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int N = 6; 
        int start[] = {1,3,0,5,8,5};
        int end[] =  {2,4,5,7,9,9};
        System.out.println(solve(N, start, end));
    }
}

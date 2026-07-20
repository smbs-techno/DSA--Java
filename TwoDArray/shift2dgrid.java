package TwoDArray;
import java.util.*;
public class shift2dgrid{
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int size=m*n;
        int[] temp=new int[size];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[idx++]=grid[i][j];
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        idx=0;
        for(int i=0;i<m;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                int x = ((idx-k)%size + size)%size;
                int val=temp[x];
                list.add(val);
                idx++;
            }
            ans.add(list);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] grid = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        int k = 4;
        System.out.print(shiftGrid(grid, k));
    }
}
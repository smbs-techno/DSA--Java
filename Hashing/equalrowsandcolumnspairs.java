package Hashing;

import java.util.HashMap;

public class equalrowsandcolumnspairs {
    public static int equalPairs(int[][] grid) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<grid.length;j++){
                sb.append(grid[i][j]).append(",");
            }
            String row=sb.toString();
            map.put(row,map.getOrDefault(row,0)+1);
        }
        int ans=0;
        for(int j=0;j<grid.length;j++){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<grid.length;i++){
                sb.append(grid[i][j]).append(",");
            }
            String col=sb.toString();
            if(map.containsKey(col)){
                ans+=map.get(col);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] grid={{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.print(equalPairs(grid));
    }
}

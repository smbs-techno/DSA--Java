package Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;

public class pascaltriangle{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
                List<Integer> map=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) map.add(1);
                else {
                    int val=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    map.add(val);
                }
            }
            list.add(map);
        }
        return list;
    }
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> res = generate(n);

        System.out.println(res);
    }

}
package Maths;

import java.util.ArrayList;
import java.util.List;

public class selfdividingnumbers {
    public static boolean selfdivide(int num){
        int x=num;
        while(x>0){
            int d=x%10;
            if(d==0 || num%d != 0) return false;
            x=x/10;
        }
        return true;
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfdivide(i)) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        int left=22;
        int right=47;
        List<Integer> ans=new ArrayList<>();
        ans=selfDividingNumbers(left, right);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
} 

package Maths;
import java.util.*;

public class maximumproductoftwodigits{
    public static int maxProduct(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            int d=n%10;
            list.add(d);
            n=n/10;
        }
        Collections.sort(list,Collections.reverseOrder());
        int ans=list.get(0)*list.get(1);
        return ans;
    }

    public static void main(String[] args){
        int n = 124;
        System.out.println(maxProduct(n));
    }
}
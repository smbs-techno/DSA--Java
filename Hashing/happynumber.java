package Hashing;

import java.util.HashSet;

public class happynumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        while(!set.contains(sum) && sum!=1){
            set.add(sum);
            sum=0;
            while(n>0){
                int d=n%10;
                int sq=d*d;
                sum+=sq;
                n=n/10;
            }
            n=sum;
        }
        if(sum==1) return true;
        return false;
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappy(n));
    }
}

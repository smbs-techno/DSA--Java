
import java.util.*;
public class addtoarrayformofintegers{
    public static List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> list=new ArrayList<>();
       int sum=0;
       for(int i=num.length-1;i>=0;i--){
        sum=num[i]+k;
        list.add(sum%10);
        k=sum/10;
       }
       while(k>0){
        list.add(k%10);
        k=k/10;
       }
       Collections.reverse(list);
       return list;
    }
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        System.out.print(addToArrayForm(num, k));
    }
}
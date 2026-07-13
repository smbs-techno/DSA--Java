package Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sequentialdigits {
    public static List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num=i;
            for(int next=num+1;next<=9;next++){
                num=num*10+next;
                if(num>=low && num<=high) list.add(num);
                if(num>high) break;
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int low=100;
        int high=300;
        List<Integer> list=sequentialDigits(low, high);
        System.out.print(list);
    }
}

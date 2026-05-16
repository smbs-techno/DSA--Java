package Arrays;

import java.util.*;

public class separatedigitsinanarray{
    public static int[] solve(int[] nums){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i : nums){
            String s=String.valueOf(i);
            for(int j=0;j<s.length();j++){
                list.add(s.charAt(j)-'0');
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
        // StringBuilder sb=new StringBuilder();
        // for(int i : nums){
        //     sb.append(i);
        // }
        // String s=sb.toString();
        // String[] input=s.split(",");
        // StringBuilder sb1=new StringBuilder();
        // for(char i=0;i<input.length;i++){
        //     sb1.append(input[i]);
        // }
        // String s1=sb1.toString();
        // String[] ans=s1.split("");
        // int[] arr=new int[ans.length];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=Integer.parseInt(ans[i]);
        // }
        // return arr;
    }
    public static void main(String[] args) {
        int[] arr={1234,87,9,677,0};
        int[] ar=solve(arr);
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
        }
    }
}

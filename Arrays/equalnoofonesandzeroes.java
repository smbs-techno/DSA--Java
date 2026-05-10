package Arrays;

import java.util.*;

public class equalnoofonesandzeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) sum+=-1;
            else sum+=1;
            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                maxlen=Math.max(maxlen,len);
            }
            else map.put(sum,i);
        }
        System.out.print(maxlen);
        sc.close();
    }
}


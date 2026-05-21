package Arrays;

import java.util.Scanner;

public class maximumproductsubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int zero=0;
        int negative=0;
        int product=1;
        int maxnegative=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
                continue;
            }
            if(arr[i]<0){
                negative++;
                maxnegative=Math.max(maxnegative, arr[i]);
            }
            product=product*arr[i];
        }
        if(zero==n) System.out.print(0);
        else if(negative % 2!=0){
            product=product/maxnegative;
            System.out.print(product);
        }
        else{
            System.out.print(product);
        }
        sc.close();
    }
}

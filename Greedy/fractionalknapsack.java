package Greedy;

import java.util.*;

class Item{
    int value;
    int weight;
    double ratio;

    Item(int value,int weight){
        this.value=value;
        this.weight=weight;
        this.ratio=(double) value/weight;
    }
}
public class fractionalknapsack{
    public static double solve(Item[] items,int capacity){
        Arrays.sort(items, (a,b)->Double.compare(b.ratio,a.ratio));
        double profit=0;
        for(Item item : items){
            if(item.weight<=capacity){
                profit+=item.value;
                capacity-=item.weight;
            }
            else{
                profit+=item.ratio * capacity;
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       Item[] items=new Item[n];
       for(int i=0;i<n;i++){
            int value=sc.nextInt();
            int weight=sc.nextInt();
            items[i]=new Item(value, weight);
       }
       int capacity=sc.nextInt();
       System.out.println(solve(items, capacity));
       sc.close();
    }
}
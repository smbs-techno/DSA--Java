package Greedy;

public class canplaceflowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    n--;
                    if(n==0) return true;
                }
            }
        }
        return false;



        // this code passes 122/130 testcases
        // int count=0;
        // for(int i : flowerbed){
        //     if(i==1) count++;
        // }
        // int total=count+n;
        // int size=flowerbed.length;
        // if(size%2==0){
        //     return total<=size/2;
        // }
        // return total<=size/2+1;
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}

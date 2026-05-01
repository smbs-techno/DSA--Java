package Sliding_Window;
public class slidingwindowmaximum {
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        int max=arr[0];
        for(int i=0;i<k;i++){
           max=Math.max(arr[i],max);
        }
        System.out.print(max);
        for(int i=k;i<arr.length;i++){
            
        }
    }
}
